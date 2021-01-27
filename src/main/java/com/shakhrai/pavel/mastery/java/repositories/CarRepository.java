package com.shakhrai.pavel.mastery.java.repositories;

import com.shakhrai.pavel.mastery.java.entities.Car;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends CrudRepository<Car, Integer> {
}
