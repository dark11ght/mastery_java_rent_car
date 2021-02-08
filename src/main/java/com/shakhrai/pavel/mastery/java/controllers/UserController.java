package com.shakhrai.pavel.mastery.java.controllers;

import com.shakhrai.pavel.mastery.java.dto.UserDTO;
import com.shakhrai.pavel.mastery.java.entities.User;
import com.shakhrai.pavel.mastery.java.service.UserService;
import com.shakhrai.pavel.mastery.java.validation.LoginPasswordValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/authorization")
    public ModelAndView authorization(@RequestParam String login, @RequestParam String password) {

        ModelAndView modelAndView = new ModelAndView();

        if (login.isEmpty()) {
            String message = "Enter login";
            modelAndView.addObject("message", message);
            modelAndView.setViewName(PageEnum.INFORMER_PAGE.getValue());
            return modelAndView;
        }

        if (LoginPasswordValidator.validationLogin(login) && LoginPasswordValidator.validationPassword(password)) {
            UserDTO userDTO = userService.getUserByLogin(login, password);

            if (userDTO != null) {
                modelAndView.addObject("user", userDTO);
                modelAndView.setViewName(PageEnum.WELCOME_PAGE.getValue());
            } else {
                String message = "User not found";
                modelAndView.addObject("message", message);
                modelAndView.setViewName(PageEnum.INFORMER_PAGE.getValue());
            }

        } else {
            String message = "Incorrect login or password";
            modelAndView.addObject("message", message);
            modelAndView.setViewName(PageEnum.INFORMER_PAGE.getValue());
        }

        return modelAndView;
    }

    @RequestMapping(value = "/registration")
    public ModelAndView registration(User user) {

        ModelAndView modelAndView = new ModelAndView();


        if (LoginPasswordValidator.validationLogin(user.getLogin()) && LoginPasswordValidator.validationPassword(user.getPassword())) {
            if(userService.createUser(user)) {
                String message = "User created";
                modelAndView.addObject("message", message);
                modelAndView.setViewName(PageEnum.INFORMER_PAGE.getValue());
            }else {
            String message = "User already exist";
            modelAndView.addObject("message", message);
            modelAndView.setViewName(PageEnum.INFORMER_PAGE.getValue());
            }
        }
        return modelAndView;
    }


}
