package com.example.demo.db.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.db.entities.Fruit;

public interface FruitRepository extends CrudRepository<Fruit, Integer> {
}
