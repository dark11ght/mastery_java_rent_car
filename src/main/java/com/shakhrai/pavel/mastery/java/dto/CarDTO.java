package com.shakhrai.pavel.mastery.java.dto;

import com.shakhrai.pavel.mastery.java.entities.CarMark;
import com.shakhrai.pavel.mastery.java.entities.CarModel;
import com.shakhrai.pavel.mastery.java.entities.CarStatus;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class CarDTO {
    private long id;
    private CarMark mark;
    private CarModel model;
    private int millage;
    private float price;
    private CarStatus carStatus;

}
