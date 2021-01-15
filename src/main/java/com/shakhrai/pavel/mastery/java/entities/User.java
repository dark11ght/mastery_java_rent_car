package com.shakhrai.pavel.mastery.java.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Getter
@Setter
@ToString
@Entity
@Table(name = "users")
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private long id;

    @Column(name = "login", unique = true, nullable = false)
    private String login;

    @Column(name = "password", nullable = false)
    private String password;

    @ManyToOne
    @JoinColumn(name = "role_id")
    private Role role;

    @Column(name = "active_status", nullable = false)
    private boolean activeStatus;

    @Column(name = "email", unique = true, nullable = false)
    private String email;

    @Column(name = "phone_number", unique = true, nullable = false)
    private String phoneNumber;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(name = "passport_serial_number", unique = true, nullable = false)
    private String passportSerialNumber;

    @Column(name = "driver_licence_serial_number", unique = true, nullable = false)
    private String driverLicenceNumber;

    @Column(name = "registration_date")
    private Timestamp dateOfRegistration;

    public User() {
    }

}
