package com.shakhrai.pavel.mastery.java.entities;

import javax.persistence.Entity;
import java.io.Serializable;
import java.sql.Timestamp;

@Entity
public class User implements Serializable {
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

    public User() {
    }

}
