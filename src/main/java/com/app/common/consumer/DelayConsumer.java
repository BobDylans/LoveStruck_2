package com.app.common.consumer;

import com.app.common.cache.StatusCache;
import com.app.common.constant.DelayMessage;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author 舒润
 */
@Slf4j
@Component
@RequiredArgsConstructor
public class DelayConsumer {
    @RabbitHandler
    @RabbitListener(queues = DelayMessage.DELAY_QUEUE)
    public void onMessage(DelayMessage message) {
        long orderId = message.getId();
        Boolean isPay = StatusCache.cache.get(message.getId());
        boolean cancel =false;
        if(isPay){
            log.info("订单 {} 付款成功。",message.getId());
            return;
        }
        String time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
        if (cancel) {
            log.info("订单超时:{},订单取消{}",message.getId(),time);
        }
    }
}
