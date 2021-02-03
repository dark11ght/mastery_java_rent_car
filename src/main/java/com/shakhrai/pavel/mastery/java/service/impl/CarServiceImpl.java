package com.shakhrai.pavel.mastery.java.service.impl;

import com.shakhrai.pavel.mastery.java.dto.CarDTO;
import com.shakhrai.pavel.mastery.java.entities.Car;
import com.shakhrai.pavel.mastery.java.mapper.CarMapper;
import com.shakhrai.pavel.mastery.java.repositories.CarRepository;
import com.shakhrai.pavel.mastery.java.service.CarService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    private static final Logger LOGGER = LogManager.getLogger(CarServiceImpl.class);

    @Autowired
    CarRepository carRepository;

    @Autowired
    CarMapper carMapper;

    @Override
    public List<CarDTO> findAllCar() {
        List<Car> carList = (List<Car>) carRepository.findAll();

        List<CarDTO> carDTOList = new ArrayList<>();

        for (Car car : carList) {
            carDTOList.add(carMapper.carToCarDTO(car));
        }
        return carDTOList;
    }

    @Override
    public CarDTO findCarById(Long id) {
        return null;
    }

    @Override
    public boolean blockCarByOrder(Long id) {
        return false;
    }

    @Override
    public boolean unBlockCarByOrder(Long id) {
        return false;
    }
}
