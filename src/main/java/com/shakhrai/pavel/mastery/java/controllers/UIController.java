package com.shakhrai.pavel.mastery.java.controllers;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class UIController {


    @RequestMapping(value = {"/", "/index"})
    public String getIndex() {
        return PageEnum.INDEX.getValue();
    }

    @GetMapping(value = "sign_page")
    public String getSignPage() {
        return PageEnum.SIGN_PAGE.getValue();
    }

    @GetMapping(value = "registration_page")
    public String getRegistrationPage() {
        return PageEnum.REGISTRATION_PAGE.getValue();
    }

}

