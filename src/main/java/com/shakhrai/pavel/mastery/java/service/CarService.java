package com.shakhrai.pavel.mastery.java.service;

import com.shakhrai.pavel.mastery.java.dto.CarDTO;

import java.util.List;

public interface CarService {
    public List<CarDTO> findAllCar();

    public CarDTO findCarById(Long id);

    public boolean blockCarByOrder(Long id);

    public boolean unBlockCarByOrder(Long id);
}
