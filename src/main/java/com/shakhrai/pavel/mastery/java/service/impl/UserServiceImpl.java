package com.shakhrai.pavel.mastery.java.service.impl;

import com.shakhrai.pavel.mastery.java.dto.UserDTO;
import com.shakhrai.pavel.mastery.java.entities.User;
import com.shakhrai.pavel.mastery.java.mapper.UserMapper;
import com.shakhrai.pavel.mastery.java.repositories.UsersRepository;
import com.shakhrai.pavel.mastery.java.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
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
    public UserDTO createUser(User user) {
        return null;
    }


}
