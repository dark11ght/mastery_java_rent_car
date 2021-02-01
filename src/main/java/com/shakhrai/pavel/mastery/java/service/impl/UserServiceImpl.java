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
    private UsersRepository usersRepository;

    @Override
    public UserDTO getUserById(Long id) {
        return null;
    }

    /*@Autowired
    UserMapper userMapper;*/


    @Override
    public UserDTO getUserByLogin(String login, String password) {

        User user = usersRepository.findByLogin(login);

        UserDTO userDTO = UserMapper.USER_MAPPER.userToUserDTO(user);

        if (userDTO != null && userDTO.getPassword().matches(password)) {
            return userDTO;
        }

        return null;
    }


}
