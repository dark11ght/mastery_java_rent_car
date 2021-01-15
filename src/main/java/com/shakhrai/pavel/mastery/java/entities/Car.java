package com.shakhrai.pavel.mastery.java.entities;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@ToString
@Entity
@Table(name = "car")
public class Car implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private long id;

    @ManyToOne
    @JoinColumn(name = "mark_id")
    private CarMark mark;

    @ManyToOne
    @JoinColumn(name = "model_id")
    private CarModel model;

    @Column(name = "millage", nullable = false)
    private int millage;

    @Column(name = "price", nullable = false)
    private float price;

    @ManyToOne
    @JoinColumn(name = "car_status_id")
    private CarStatus carStatus;

    public Car() {
    }

}
