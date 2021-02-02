package com.shakhrai.pavel.mastery.java.mapper;

import com.shakhrai.pavel.mastery.java.dto.RoleDTO;
import com.shakhrai.pavel.mastery.java.dto.UserDTO;
import com.shakhrai.pavel.mastery.java.entities.Role;
import com.shakhrai.pavel.mastery.java.entities.User;
import org.mapstruct.Mapper;

import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserDTO userToUserDTO(User user);

    User userDTOToUser(UserDTO userDTO);

    RoleDTO roleToRoleDTO (Role role);

    Role roleDTOToRole (RoleDTO roleDTO);


}
