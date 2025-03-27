package com.irrigation.smartirrigationbackend.controller;

import com.irrigation.smartirrigationbackend.model.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

@Service
public class DataService {
    @Autowired
    DataRepository dataRepository;

    public List<String> getAllCropType(){
        List<Data> dataList = dataRepository.findAll();
        HashSet<String> hs = new HashSet<>();
        for(Data d: dataList){
            hs.add(d.getCropType());
        }
        return new ArrayList<>(hs);
    }
    public List<String> getAllRegion(){
        List<Data> dataList = dataRepository.findAll();
        HashSet<String> hs = new HashSet<>();
        for(Data d: dataList){
            hs.add(d.getRegion());
        }
        return new ArrayList<>(hs);
    }
}
