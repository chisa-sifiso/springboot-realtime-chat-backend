package tut.WebSocketChatApplication.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import tut.WebSocketChatApplication.model.ChatMessage;

public class ChatController {
    @MessageMapping("/send") // Handles messages sent to "/app/send"
    @SendTo("/topic/messages") // Broadcasts messages to "/topic/messages"
    public ChatMessage sendMessage(ChatMessage message) {
        return message; // Sends the message back to all connected clients
    }
}
