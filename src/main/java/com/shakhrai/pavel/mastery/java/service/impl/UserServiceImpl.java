package com.shakhrai.pavel.mastery.java.service.impl;

import com.shakhrai.pavel.mastery.java.dto.UserDTO;
import com.shakhrai.pavel.mastery.java.entities.User;
import com.shakhrai.pavel.mastery.java.mapper.UserMapper;
import com.shakhrai.pavel.mastery.java.repositories.UsersRepository;
import com.shakhrai.pavel.mastery.java.service.UserService;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.time.LocalDateTime;

@Service

public class UserServiceImpl implements UserService {

    private static final Logger LOGGER = LogManager.getLogger();

    @Autowired
    UserMapper userMapper;

    @Autowired
    private UsersRepository usersRepository;

    @Override
    public UserDTO getUserById(Long id) {
        return null;
    }


    @Override
    public UserDTO getUserByLogin(String login, String password) {

        UserDTO userDTO = userMapper.userToUserDTO(usersRepository.findByLogin(login));

        if (userDTO != null && userDTO.getPassword().matches(password)) {
            return userDTO;
        }
        LOGGER.warn("User not found");
        return null;
    }

    @Override
    public boolean deleteUserById(Long id) {
        usersRepository.deleteById(id);
        return true;
    }

    @Override
    public UserDTO editUser(User user) {
        return null;
    }

    @Override
    public boolean createUser(User user) {
        User userFromDB = usersRepository.findByLogin(user.getLogin());
        if(userFromDB != null){
            return false;
        }

        user.setDateOfRegistration(Timestamp.valueOf(LocalDateTime.now()));
        System.out.println(user);
        usersRepository.save(user);

        return true;
    }


}
