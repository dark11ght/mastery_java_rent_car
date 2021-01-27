package com.shakhrai.pavel.mastery.java.repositories;

import com.shakhrai.pavel.mastery.java.entities.Order;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends CrudRepository<Order, Long> {
}
