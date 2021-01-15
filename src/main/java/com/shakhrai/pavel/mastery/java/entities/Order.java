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
@Table(name = "orders")
public class Order implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "car_id")
    private Car car;

    @Column(name = "rent_hours", nullable = false)
    private int rentHours;

    @Column(name = "total_price", nullable = false)
    private double totalPrice;

    @Column(name = "payment_status", nullable = false)
    private boolean paymentStatus;

    @Column(name = "confirm_status_by_admin", nullable = false)
    private boolean confirmByAdminStatus;

    @Column(name = "date_reg_order", nullable = false)
    private Timestamp dateOfRegOrder;

    @Column(name = "order_status", nullable = false)
    private boolean orderStatus;

    @Column(name = "notes")
    private String notes;

    public Order() {
    }


}
