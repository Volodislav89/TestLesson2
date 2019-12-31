package com.testlesson.testlesson2.controller;

import com.testlesson.testlesson2.model.Dog;
import com.testlesson.testlesson2.repository.DogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@CrossOrigin
@RequestMapping("/api/dog")

public class DogController {
    @Autowired
    DogRepository dogRepository;

    @GetMapping
    public Flux<Dog> getAllDogs() {
        return dogRepository.findAll();
    }
}
