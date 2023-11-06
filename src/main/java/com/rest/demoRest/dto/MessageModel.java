package com.rest.demoRest.dto;

import lombok.Data;

@Data
public class MessageModel {

    private String message;
    private String routingKey;
}