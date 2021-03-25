package com.example;

import lombok.extern.slf4j.Slf4j;

import javax.inject.Singleton;

@Slf4j
@Singleton
public class AnimalService {
    private final AnimalClient animalClient;

    public AnimalService(AnimalClient animalClient) {
        this.animalClient = animalClient;
    }

    public void someBusinessMethod(Animal animal) {
        log.info("sending animal {}", animal);
        animalClient.send(animal);
    }
}
