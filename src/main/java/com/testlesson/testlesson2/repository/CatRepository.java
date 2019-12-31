package com.testlesson.testlesson2.repository;

import com.testlesson.testlesson2.model.Cat;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface CatRepository extends ReactiveMongoRepository<Cat, String> {

}
