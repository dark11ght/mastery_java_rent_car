package com.shakhrai.pavel.mastery.java.dto;

import com.shakhrai.pavel.mastery.java.entities.Car;
import com.shakhrai.pavel.mastery.java.entities.User;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.sql.Timestamp;

@Getter
@Setter
@ToString
public class OrderDTO {
    private long id;
    private User user;
    private Car car;
    private int rentHours;
    private double totalPrice;
    private boolean paymentStatus;
    private boolean confirmByAdminStatus;
    private Timestamp dateOfRegOrder;
    private boolean orderStatus;
    private String notes;

}
