package com.shakhrai.pavel.mastery.java.controllers;

import com.shakhrai.pavel.mastery.java.dto.CarDTO;
import com.shakhrai.pavel.mastery.java.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping(value = "/car")
public class CarController {

    @Autowired
    CarService carService;

    @RequestMapping(value = "/findAllCars")
    public ModelAndView findAllCars(){
        ModelAndView modelAndView = new ModelAndView();
        List<CarDTO> carDTOList = carService.findAllCar();

        modelAndView.addObject("carsList", carDTOList);
        modelAndView.setViewName(PageEnum.CARS_LIST_PAGE.getValue());
        return modelAndView;
    }

}
