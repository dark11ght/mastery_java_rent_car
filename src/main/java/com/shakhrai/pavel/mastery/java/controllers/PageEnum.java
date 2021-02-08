package com.shakhrai.pavel.mastery.java.controllers;

public enum PageEnum {
    INDEX("index"),
    WELCOME_PAGE("welcome_page"),
    SIGN_PAGE("sign_page"),
    REGISTRATION_PAGE("registration_page"),
    CARS_LIST_PAGE("cars_list"),
    INFORMER_PAGE("informer");


    private String value;

    private PageEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
