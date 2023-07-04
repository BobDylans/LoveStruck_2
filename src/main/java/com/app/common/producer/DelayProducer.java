package com.app.common.producer;

import com.app.common.constant.DelayMessage;
import lombok.RequiredArgsConstructor;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Component;

/**
 * @author 舒润
 */
@Component
@RequiredArgsConstructor
public class DelayProducer {

    private final RabbitTemplate rabbitTemplate;

    public void delaySendId(Long id,int delay){
        DelayMessage delayMessage = new DelayMessage();
        delayMessage.setId(id);

        rabbitTemplate.convertAndSend(DelayMessage.DELAY_EXCHANGE,
                DelayMessage.DELAY_ROUTE_KEY,delayMessage,message -> {
                    message.getMessageProperties().setHeader("x-delay",delay);
                    return message;
                });
    }
}
