package com.shakhrai.pavel.mastery.java.entities;

import javax.persistence.Entity;
import java.io.Serializable;
import java.sql.Timestamp;

@Entity
public class Order implements Serializable {
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

    public Order() {
    }


}
