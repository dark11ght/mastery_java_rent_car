package com.shakhrai.pavel.mastery.java.dto;

import com.shakhrai.pavel.mastery.java.entities.Role;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


import java.sql.Timestamp;

@Getter
@Setter
@ToString

public class UserDTO {
    private long id;
    private String login;
    private String password;
    private Role role;
    private boolean activeStatus;
    private String email;
    private String phoneNumber;
    private String firstName;
    private String lastName;
    private String passportSerialNumber;
    private String driverLicenceNumber;
    private Timestamp dateOfRegistration;

}
