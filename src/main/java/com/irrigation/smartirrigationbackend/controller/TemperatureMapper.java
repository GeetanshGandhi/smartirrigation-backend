package com.irrigation.smartirrigationbackend.controller;

import java.util.HashMap;
import java.util.Map;

public class TemperatureMapper {

    public String map(int temp){
        Map<Integer, String> hm = new HashMap<>();
        hm.put(2,"20-30");
        hm.put(3,"30-40");
        hm.put(4,"40-50");
        hm.put(30,"20-30");
        hm.put(40,"30-40");
        hm.put(50,"40-50");
        if(hm.containsKey(temp)) return hm.get(temp);
        return hm.get((temp/10)%10);
    }
}
