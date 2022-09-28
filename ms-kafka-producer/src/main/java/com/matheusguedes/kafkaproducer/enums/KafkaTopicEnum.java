package com.matheusguedes.kafkaproducer.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum KafkaTopicEnum {

    MAIN_TOPIC("main-topic");

    private final String name;

}