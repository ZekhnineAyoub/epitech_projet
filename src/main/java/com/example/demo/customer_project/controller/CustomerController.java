package com.example.demo.customer_project.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1")
public class CustomerController {


    @GetMapping
    public String getMessageEpitech(){
        return  "hello epitech ";
    }

}
