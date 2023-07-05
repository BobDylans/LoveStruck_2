package com.app.config;

import com.app.common.constant.DelayMessage;
import org.springframework.amqp.core.*;
import org.springframework.amqp.rabbit.connection.CachingConnectionFactory;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.connection.CorrelationData;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.rabbit.listener.SimpleMessageListenerContainer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 舒润
 */
@Configuration
public class RabbitMqConfig {
    @Value("${spring.rabbitmq.host}")
    private String host;
    @Value("${spring.rabbitmq.port}")
    private int port;
    @Value("${spring.rabbitmq.username}")
    private String username;
    @Value("${spring.rabbitmq.password}")
    private String password;
    @Value("${spring.rabbitmq.virtual-host}")
    private String virtual_host;

    @Autowired
    private Receiver receiver;

    @Bean(name = "connectionFactory")
    public ConnectionFactory connectionFactory() {
        CachingConnectionFactory connectionFactory = new CachingConnectionFactory(host, port);
        connectionFactory.setUsername(username);
        connectionFactory.setPassword(password);
        connectionFactory.setVirtualHost(virtual_host);
        return connectionFactory;
    }


    @Bean
    public RabbitTemplate rabbitTemplate(){
        RabbitTemplate rabbitTemplate = new RabbitTemplate(connectionFactory());
        // 发送方确认，回调函数
        rabbitTemplate.setConfirmCallback(confirmCallback());
        // 开启失败通知
        rabbitTemplate.setMandatory(true);
        //  发送失败回调函数
        rabbitTemplate.setReturnCallback(returnsCallback());
        return rabbitTemplate;
    }

    @Bean
    public RabbitTemplate.ConfirmCallback confirmCallback(){
        return new RabbitTemplate.ConfirmCallback() {
            @Override
            public void confirm(CorrelationData correlationData, boolean ack, String cause) {
                if (ack) {
                    System.out.println("Message successfully sent to RabbitMq!");
                } else {
                    System.out.println("Message not sent to RabbitMq! Confirm callback returned " + cause);
                }
            }
        };
    }

    @Bean
    public RabbitTemplate.ReturnsCallback returnsCallback(){
        return new RabbitTemplate.ReturnsCallback() {
            @Override
            public void returnedMessage(ReturnedMessage returnedMessage){
                System.out.println("returnedMessage = " + returnedMessage);
            }
        };
    }

    @Bean
    public SimpleMessageListenerContainer messageListenerContainer(){
        SimpleMessageListenerContainer container = new SimpleMessageListenerContainer(connectionFactory());
        // 绑定队列
        container.setQueues(delayQueue());
        // 手动提交
        container.setAcknowledgeMode(AcknowledgeMode.MANUAL);
        // 消费确认
        container.setMessageListener(receiver);
        return container;
    }

    /**
     * 声明延迟队列，和延迟交换机，并声明绑定关系
     */
    @Bean("delayQueue")
    public Queue delayQueue(){
        Queue queue = new Queue(DelayMessage.DELAY_QUEUE, true, false, true);
        return queue;
    }
    @Bean("delayExchange")
    public CustomExchange delayExchange(){
        Map<String, Object> args = new HashMap<>();
        // 表示这是一个基于  direct  模式的延时交换机。
        args.put("x-delayed-type", "direct");
        CustomExchange exchange = new CustomExchange(DelayMessage.DELAY_EXCHANGE,
                "x-delayed-message", true, false, args);
        return exchange;
    }
    @Bean("delayBinding")
    public Binding delayBinding(){
        Binding binding = BindingBuilder
                .bind(delayQueue())
                .to(delayExchange())
                .with(DelayMessage.DELAY_ROUTE_KEY).noargs();
        return binding;
    }

}
