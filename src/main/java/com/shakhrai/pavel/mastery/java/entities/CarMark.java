package com.shakhrai.pavel.mastery.java.entities;

import javax.persistence.Entity;
import java.io.Serializable;

@Entity
public class CarMark implements Serializable {
    private int id;
    private String mark;
    private CountryOfManufacture countryOfManufacture;

    public CarMark() {
    }


}
