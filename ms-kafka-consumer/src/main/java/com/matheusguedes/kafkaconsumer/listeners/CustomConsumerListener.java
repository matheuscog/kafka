package com.matheusguedes.kafkaconsumer.listeners;

import org.springframework.core.annotation.AliasFor;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.annotation.TopicPartition;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@KafkaListener
public @interface CustomConsumerListener {

    @AliasFor(annotation = KafkaListener.class, attribute = "topics")
    String[] topics() default { "main-topic" };

    @AliasFor(annotation = KafkaListener.class, attribute = "containerFactory")
    String containerFactory() default "containerFactory";

    @AliasFor(annotation = KafkaListener.class, attribute = "groupId")
    String groupId() default "";

    @AliasFor(annotation = KafkaListener.class, attribute = "topicPartitions")
    TopicPartition[] topicPartitions() default {};

    @AliasFor(annotation = KafkaListener.class, attribute = "errorHandler")
    String errorHandler() default "errorCustomExceptionHandler";

}