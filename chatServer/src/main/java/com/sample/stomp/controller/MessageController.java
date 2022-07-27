package com.sample.stomp.controller;

import com.sample.stomp.model.ChatMessage;
import lombok.RequiredArgsConstructor;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.simp.SimpMessageSendingOperations;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

@RestController
@RequiredArgsConstructor
public class MessageController {

    private final SimpMessageSendingOperations sendingOperations;

    @MessageMapping("/chat/message")
    public void enter(ChatMessage message) {
//        LocalTime now = LocalTime.now();
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH시 mm분");
//        String formatedNow = now.format(formatter);
        if (ChatMessage.MessageType.ENTER.equals(message.getType())) {
            message.setMessage(message.getSender()+"님이 입장하였습니다."/*+formatedNow*/);
        }


        sendingOperations.convertAndSend("/topic/chat/room/"+message.getRoomId(),message);
    }
}
