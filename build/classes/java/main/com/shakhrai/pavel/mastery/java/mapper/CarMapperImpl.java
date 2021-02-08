package com.shakhrai.pavel.mastery.java.mapper;

import com.shakhrai.pavel.mastery.java.dto.CarDTO;
import com.shakhrai.pavel.mastery.java.entities.Car;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-02-08T13:26:08+0300",
    comments = "version: 1.4.1.Final, compiler: javac, environment: Java 1.8.0_111 (Oracle Corporation)"
)
@Component
public class CarMapperImpl implements CarMapper {

    @Override
    public CarDTO carToCarDTO(Car car) {
        if ( car == null ) {
            return null;
        }

        CarDTO carDTO = new CarDTO();

        carDTO.setId( car.getId() );
        carDTO.setMark( car.getMark() );
        carDTO.setModel( car.getModel() );
        carDTO.setMillage( car.getMillage() );
        carDTO.setPrice( car.getPrice() );
        carDTO.setCarStatus( car.getCarStatus() );

        return carDTO;
    }

    @Override
    public Car carDTOtoCar(CarDTO carDTO) {
        if ( carDTO == null ) {
            return null;
        }

        Car car = new Car();

        car.setId( carDTO.getId() );
        car.setMark( carDTO.getMark() );
        car.setModel( carDTO.getModel() );
        car.setMillage( carDTO.getMillage() );
        car.setPrice( carDTO.getPrice() );
        car.setCarStatus( carDTO.getCarStatus() );

        return car;
    }
}
