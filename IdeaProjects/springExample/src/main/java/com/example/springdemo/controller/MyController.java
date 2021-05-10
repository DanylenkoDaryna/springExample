package com.example.springdemo.controller;


import com.example.springdemo.model.City;
import com.example.springdemo.service.ICityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class MyController {

    @Autowired
    private ICityService cityService;

    @GetMapping("/cities")
    public String findCities(Model model) {

        List<City> cities = cityService.findAll();

        model.addAttribute("cities", cities);

        return "showCities";
    }
}
