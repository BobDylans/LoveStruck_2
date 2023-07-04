package com.app.controller;

import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 舒润
 */

@Api("websocket 连接控制器")
@RestController
@MessageMapping("/app")
public class WebSocketController {

    @Autowired
    private SimpMessagingTemplate messagingTemplate;

}
