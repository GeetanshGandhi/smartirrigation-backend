package com.irrigation.smartirrigationbackend.controller;

public class OutputDataToESP {
    private String deviceId;
    private double waterLower;
    private double waterUpper;

    public OutputDataToESP(String deviceId, double waterLower, double waterUpper) {
        this.deviceId = deviceId;
        this.waterLower = waterLower;
        this.waterUpper = waterUpper;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
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
