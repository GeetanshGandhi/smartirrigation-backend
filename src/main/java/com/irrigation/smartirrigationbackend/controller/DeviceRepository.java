package com.irrigation.smartirrigationbackend.controller;

import com.irrigation.smartirrigationbackend.model.Device;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeviceRepository extends JpaRepository<Device, String> {
}
