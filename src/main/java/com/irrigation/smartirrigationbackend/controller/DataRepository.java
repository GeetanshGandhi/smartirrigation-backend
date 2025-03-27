package com.irrigation.smartirrigationbackend.controller;

import com.irrigation.smartirrigationbackend.model.Data;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface DataRepository extends JpaRepository<Data, Integer> {
    Data findByCropTypeAndRegionAndTemperature(String cropType, String region, String temperature);
}
