package com.shakhrai.pavel.mastery.java.entities;

import javax.persistence.Entity;
import java.io.Serializable;

@Entity
public class CarStatus implements Serializable {
    private int id;
    private String carStatus;

    public CarStatus() {
    }


}
