package com.irrigation.smartirrigationbackend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/data")
public class DataController {

    @Autowired
    DataService dataService;

    @GetMapping("/getAllCrop")
    public List<String> getAllCrop(){
        return dataService.getAllCropType();
    }
    @GetMapping("/getAllRegion")
    public List<String> getAllRegion(){
        return dataService.getAllRegion();
    }
}
