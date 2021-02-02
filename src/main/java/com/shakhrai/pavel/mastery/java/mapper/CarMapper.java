package com.shakhrai.pavel.mastery.java.mapper;

import com.shakhrai.pavel.mastery.java.dto.CarDTO;
import com.shakhrai.pavel.mastery.java.entities.Car;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface CarMapper {

    CarMapper CAR_MAPPER = Mappers.getMapper(CarMapper.class);

    CarDTO carToCarDTO(Car car);

    Car carDTOtoCar(CarDTO carDTO);

}
