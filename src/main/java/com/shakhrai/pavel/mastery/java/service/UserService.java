package com.shakhrai.pavel.mastery.java.service;

import com.shakhrai.pavel.mastery.java.dto.UserDTO;
import com.shakhrai.pavel.mastery.java.entities.User;

public interface UserService {

    public UserDTO getUserById(Long id);

    //public User getUserByLogin(String login, String password);

    public UserDTO getUserByLogin(String login, String password);

}
