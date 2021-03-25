package com.example;

import io.micronaut.gcp.pubsub.annotation.PubSubClient;
import io.micronaut.gcp.pubsub.annotation.Topic;

@PubSubClient
public interface AnimalClient {

    @Topic("animals")
    void send(Animal animal);

}