package com.shakhrai.pavel.mastery.java.service;

import com.shakhrai.pavel.mastery.java.entities.User;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Component
public interface UserService {

    public User getUserById(Long id);

    public User getUserByLogin(String login);

}
