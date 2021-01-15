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
@Table(name = "car_status")
public class CarStatus implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private int id;

    @Column(name = "car_status", unique = true, nullable = false)
    private String carStatus;

    public CarStatus() {
    }

}
