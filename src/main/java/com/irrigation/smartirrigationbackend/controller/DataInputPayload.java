package com.irrigation.smartirrigationbackend.controller;

public class DataInputPayload {
    private String cropType;;
    private String region;
    private String temperature;

    public DataInputPayload(){}
    public DataInputPayload(String cropType, String region, String temperature) {
        this.cropType = cropType;
        this.region = region;
        this.temperature = temperature;
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
}
