package com.irrigation.smartirrigationbackend.controller;

import com.irrigation.smartirrigationbackend.model.Device;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/device")
@CrossOrigin
public class DeviceController {
    @Autowired
    DeviceService deviceService;

    @PostMapping("/add")
    public String addDevice(@RequestBody AddDeviceInput deviceInput){
        return deviceService.addDevice(deviceInput);
    }
    @PostMapping("/update")
    public String updateDevice(@RequestParam("deviceId") String deviceId,
                               @RequestParam("crop") String crop){
        return deviceService.updateDeviceCrop(deviceId, crop);
    }
    @PostMapping("/getData")
    public OutputDataToESP getDataForESP(@RequestBody String input){
        return deviceService.getDeviceData(input);
    }

    @GetMapping("/getAll")
    public List<Device> getAll(){
        return deviceService.getAll();
    }
}
