package com.shakhrai.pavel.mastery.java.mapper;

import com.shakhrai.pavel.mastery.java.dto.RoleDTO;
import com.shakhrai.pavel.mastery.java.dto.UserDTO;
import com.shakhrai.pavel.mastery.java.entities.Role;
import com.shakhrai.pavel.mastery.java.entities.User;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-02-01T12:26:44+0300",
    comments = "version: 1.4.1.Final, compiler: javac, environment: Java 1.8.0_111 (Oracle Corporation)"
)
@Component
public class UserMapperImpl implements UserMapper {

    @Override
    public UserDTO userToUserDTO(User user) {
        if ( user == null ) {
            return null;
        }

        UserDTO userDTO = new UserDTO();

        userDTO.setId( user.getId() );
        userDTO.setLogin( user.getLogin() );
        userDTO.setPassword( user.getPassword() );
        userDTO.setRole( user.getRole() );
        userDTO.setActiveStatus( user.isActiveStatus() );
        userDTO.setEmail( user.getEmail() );
        userDTO.setPhoneNumber( user.getPhoneNumber() );
        userDTO.setFirstName( user.getFirstName() );
        userDTO.setLastName( user.getLastName() );
        userDTO.setPassportSerialNumber( user.getPassportSerialNumber() );
        userDTO.setDriverLicenceNumber( user.getDriverLicenceNumber() );
        userDTO.setDateOfRegistration( user.getDateOfRegistration() );

        return userDTO;
    }

    @Override
    public User userDTOToUser(UserDTO userDTO) {
        if ( userDTO == null ) {
            return null;
        }

        User user = new User();

        user.setId( userDTO.getId() );
        user.setLogin( userDTO.getLogin() );
        user.setPassword( userDTO.getPassword() );
        user.setRole( userDTO.getRole() );
        user.setActiveStatus( userDTO.isActiveStatus() );
        user.setEmail( userDTO.getEmail() );
        user.setPhoneNumber( userDTO.getPhoneNumber() );
        user.setFirstName( userDTO.getFirstName() );
        user.setLastName( userDTO.getLastName() );
        user.setPassportSerialNumber( userDTO.getPassportSerialNumber() );
        user.setDriverLicenceNumber( userDTO.getDriverLicenceNumber() );
        user.setDateOfRegistration( userDTO.getDateOfRegistration() );

        return user;
    }

    @Override
    public RoleDTO roleToRoleDTO(Role role) {
        if ( role == null ) {
            return null;
        }

        RoleDTO roleDTO = new RoleDTO();

        roleDTO.setId( role.getId() );
        roleDTO.setRole( role.getRole() );

        return roleDTO;
    }

    @Override
    public Role roleDTOToRole(RoleDTO roleDTO) {
        if ( roleDTO == null ) {
            return null;
        }

        Role role = new Role();

        role.setId( roleDTO.getId() );
        role.setRole( roleDTO.getRole() );

        return role;
    }
}
