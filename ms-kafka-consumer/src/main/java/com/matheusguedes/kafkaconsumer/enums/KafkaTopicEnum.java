package com.matheusguedes.kafkaconsumer.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;

@Getter
@AllArgsConstructor
public enum KafkaTopicEnum {

    MAIN_TOPIC("main-topic");

    private final String nome;

    public static final String[] ALL_TOPICS = getNomes();

    public static String[] getNomes() {
        return Arrays.stream(KafkaTopicEnum.class.getEnumConstants()).map(Enum::name).toArray(String[]::new);
    }

}