package com.shakhrai.pavel.mastery.java.entities;

import javax.persistence.Entity;
import java.io.Serializable;

@Entity
public class CountryOfManufacture implements Serializable {
    private int id;
    private String coutry;

    public CountryOfManufacture() {
    }


}
