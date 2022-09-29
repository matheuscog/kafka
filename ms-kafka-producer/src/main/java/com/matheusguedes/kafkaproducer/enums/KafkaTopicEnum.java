package com.matheusguedes.kafkaproducer.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum KafkaTopicEnum {

    MAIN_TOPIC("main-topic");

    private final String name;

}