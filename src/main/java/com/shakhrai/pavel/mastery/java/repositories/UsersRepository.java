package com.shakhrai.pavel.mastery.java.repositories;

import com.shakhrai.pavel.mastery.java.entities.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends CrudRepository<User, Long> {
    User findByLogin(String login);
}
