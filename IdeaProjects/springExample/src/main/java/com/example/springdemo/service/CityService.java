package com.example.springdemo.service;

import com.example.springdemo.model.City;
import com.example.springdemo.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityService implements ICityService {

    @Autowired
    private CityRepository repository;

    @Override
    public List<City> findAll() {
        return (List<City>)repository.findAll();
    }
}
