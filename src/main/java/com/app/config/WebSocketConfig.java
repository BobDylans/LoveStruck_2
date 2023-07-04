package com.app.config;

import io.swagger.annotations.Api;
import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

/**
 * @author 舒润
 */
@Api("WebSocket配置类")
@Configuration
@EnableWebSocketMessageBroker
public class WebSocketConfig implements WebSocketMessageBrokerConfigurer {

    @Override
    public void registerStompEndpoints(StompEndpointRegistry registry){
        // 相当于连接前缀
        registry.addEndpoint("/websocket")
                .setAllowedOrigins("http://localhost:8080")
                .withSockJS();
    }

    @Override
    public void configureMessageBroker(MessageBrokerRegistry registry){
        // STOMP的Header字段destination中以/app前缀的会被转发到@MessageMapping中处理
        registry.setApplicationDestinationPrefixes("/app");
        // destination中以/topic,/queue前缀的，都会发送到队列中，等待消息消费
        registry.enableSimpleBroker("/topic", "/queue");
    }
}
