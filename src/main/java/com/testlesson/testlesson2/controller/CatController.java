package com.testlesson.testlesson2.controller;

import com.testlesson.testlesson2.model.Cat;
import com.testlesson.testlesson2.repository.CatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import reactor.core.publisher.Flux;

public class CatController {

    @Autowired
    CatRepository catRepository;

    @GetMapping
    public Flux<Cat> getAllCats() {
        return catRepository.findAll();
    }
}
