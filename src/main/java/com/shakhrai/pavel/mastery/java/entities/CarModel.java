package com.shakhrai.pavel.mastery.java.entities;

import javax.persistence.Entity;
import java.io.Serializable;

@Entity
public class CarModel implements Serializable {
    private int id;
    private String modelName;
    private CarMark carMark;

    public CarModel() {
    }


}
