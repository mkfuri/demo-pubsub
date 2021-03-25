package com.example;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.PathVariable;

@Controller("/animal")
public class AnimalController {
    private final AnimalService animalService;

    public AnimalController(AnimalService animalService) {
        this.animalService = animalService;
    }

    @Get("/{name}")
    String saveAnimal(@PathVariable String name){
        animalService.someBusinessMethod(new Animal(name));
        return "ok";
    }
}
