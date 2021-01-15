package com.shakhrai.pavel.mastery.java.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.TypeAlias;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@ToString
@Entity
@Table(name = "car_model")
public class CarModel implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private int id;

    @Column(name = "model", unique = true, nullable = false)
    private String modelName;

    public CarModel() {
    }


}
