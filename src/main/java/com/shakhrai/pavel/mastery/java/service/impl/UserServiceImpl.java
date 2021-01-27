package com.shakhrai.pavel.mastery.java.service.impl;

import com.shakhrai.pavel.mastery.java.entities.User;
import com.shakhrai.pavel.mastery.java.repositories.UsersRepository;
import com.shakhrai.pavel.mastery.java.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UsersRepository usersRepository;

    @Override
    public User getUserById(Long id) {
        return null;
    }

    @Override
    public User getUserByLogin(String login) {
        User user = usersRepository.findByLogin(login);
        return user;
    }


}
