package com.shakhrai.pavel.mastery.java.controllers;

import com.shakhrai.pavel.mastery.java.entities.User;
import com.shakhrai.pavel.mastery.java.service.UserService;
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
        if(login.isEmpty()){
            String message = "Enter login";
            modelAndView.addObject("message", message);
            modelAndView.setViewName(PageEnum.INFORMER_PAGE.getValue());
            return modelAndView;
        }
        User user = userService.getUserByLogin(login);


        if (user != null & user.getPassword().equals(password)) {
            modelAndView.addObject("user", user);
            modelAndView.setViewName(PageEnum.WELCOME_PAGE.getValue());
        } else {
            String message = "Incorrect login or password";
            modelAndView.addObject("message", message);
            modelAndView.setViewName(PageEnum.INFORMER_PAGE.getValue());
        }

        return modelAndView;
    }

}
