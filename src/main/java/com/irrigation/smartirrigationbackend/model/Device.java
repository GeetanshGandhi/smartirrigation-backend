package com.irrigation.smartirrigationbackend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Device {
    @Id
    private String deviceId;

    @ManyToOne
    @JoinColumn(name="dataId")
    private Data data;

    public Device(){}
    public Device(String deviceId, Data data) {
        this.deviceId = deviceId;
        this.data = data;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }
}
