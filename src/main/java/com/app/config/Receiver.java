package com.app.config;

import com.rabbitmq.client.Channel;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.listener.api.ChannelAwareMessageListener;
import org.springframework.stereotype.Component;

import java.io.IOException;

/**
 * @author 舒润
 */
@Component
public class Receiver implements ChannelAwareMessageListener {
    @Override
    public void onMessage(Message message, Channel channel) throws IOException {
        String msg = new String(message.getBody());
        System.out.println(" [x] Received >>>>" + msg);
        try {
            channel.basicAck(message.getMessageProperties().getDeliveryTag(), false);
            System.out.println("Received >>>> Message 已消费...");
        } catch (IOException e) {
            System.out.println(e.getMessage());
            channel.basicNack(message.getMessageProperties().getDeliveryTag(), false,true);
            System.out.println("Received >>>> 拒绝消费，请重新派发");
            throw e;
        }
    }
}
