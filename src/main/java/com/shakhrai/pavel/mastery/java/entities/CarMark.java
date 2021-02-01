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
@Table(name = "car_mark")
public class CarMark implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private int id;

    @Column(name = "mark", unique = true, nullable = false)
    private String mark;

    @ManyToOne
    @JoinColumn(name = "country_id")
    private CountryOfManufacture countryOfManufacture;

}
