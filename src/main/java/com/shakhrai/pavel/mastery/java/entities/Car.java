package com.shakhrai.pavel.mastery.java.entities;


import java.io.Serializable;



public class Car implements Serializable {
    private int id;
    private CarMark mark;
    private CarModel model;
    private int millage;
    private float price;
    private CarStatus carStatus;

    public Car() {
    }

}
