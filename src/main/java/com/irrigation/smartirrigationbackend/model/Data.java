package com.irrigation.smartirrigationbackend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Data {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int dataId;
    private String cropType;
    private String region;
    private String temperature;
    private double waterLower;
    private double waterUpper;

    public int getDataId() {
        return dataId;
    }

    public void setDataId(int dataId) {
        this.dataId = dataId;
    }

    public String getCropType() {
        return cropType;
    }

    public void setCropType(String cropType) {
        this.cropType = cropType;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public double getWaterLower() {
        return waterLower;
    }

    public void setWaterLower(double waterLower) {
        this.waterLower = waterLower;
    }

    public double getWaterUpper() {
        return waterUpper;
    }

    public void setWaterUpper(double waterUpper) {
        this.waterUpper = waterUpper;
    }
}
