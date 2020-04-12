package com.mohammadalsalkini.msjms.sender;

import com.mohammadalsalkini.msjms.config.JmsConfig;
import com.mohammadalsalkini.msjms.model.HelloWorldMessage;
import lombok.RequiredArgsConstructor;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.UUID;

/**
 * @author Mohammad Alsalkini
 * @project ms-jms
 * @created 12.04.2020 - 07:29
 */
@RequiredArgsConstructor
@Component
public class HelloSender {

    private final JmsTemplate jmsTemplate;

    @Scheduled(fixedRate = 2000)
    public void sendMessage() {
        System.out.println("I'm sending a message");

        HelloWorldMessage message = new HelloWorldMessage()
                .builder()
                .id(UUID.randomUUID())
                .message("HEllo World")
                .build();

        jmsTemplate.convertAndSend(JmsConfig.MY_QUEUE, message);

        System.out.println("Message sent!");
    }
}
