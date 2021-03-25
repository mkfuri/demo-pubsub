package com.example;


import io.micronaut.gcp.pubsub.annotation.PubSubListener;
import io.micronaut.gcp.pubsub.annotation.Subscription;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@PubSubListener
public class AnimalListener {

    @Subscription("animals")
    public void onMessage(Animal animal) {
        log.info("Message received {}", animal);
    }

}