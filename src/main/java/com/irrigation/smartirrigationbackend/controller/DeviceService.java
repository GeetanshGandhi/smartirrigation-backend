package com.irrigation.smartirrigationbackend.controller;

import com.irrigation.smartirrigationbackend.model.Data;
import com.irrigation.smartirrigationbackend.model.Device;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DeviceService {
    @Autowired
    private DeviceRepository deviceRepository;
    @Autowired
    private DataRepository dataRepository;

    public String addDevice(AddDeviceInput input){
        String temp = "20-30";
        Data data = dataRepository.findByCropTypeAndRegionAndTemperature(input.getCropType(), input.getRegion(), temp);
        System.out.println("fetched data: ");
        System.out.println(data.toString());
        Device device = new Device(input.getDeviceId(), data);
        Device added = deviceRepository.save(device);
        System.out.println(added.toString());
        return "Success";
    }
    public String updateDeviceCrop(String deviceId, String cropType){
        Device device = deviceRepository.findById(deviceId).get();
        device.getData().setCropType(cropType);
        deviceRepository.save(device);
        return "Success";
    }
    public Data updateDeviceTemperature(String deviceId, String temperature){
        Device device = deviceRepository.findById(deviceId).get();
        DataInputPayload dataInputPayload= new DataInputPayload(device.getData().getCropType(),
                device.getData().getRegion(), temperature);
        Data data = dataRepository.findByCropTypeAndRegionAndTemperature(device.getData().getCropType(),
                device.getData().getRegion(), temperature);
        device.setData(data);
        deviceRepository.save(device);
        return data;
    }
    public OutputDataToESP getDeviceData(String input){
        String[] fields = input.split(" ");
        System.out.println(fields[0]+" and "+fields[1]);
        String mappedTemp = new TemperatureMapper().map(Integer.parseInt(fields[1]));
        System.out.println(mappedTemp);
        Optional<Device> getdevice = deviceRepository.findById(fields[0]);
        if(getdevice.isEmpty()){
            return new OutputDataToESP(null, 0.0, 0.0);
        }
        Device device = getdevice.get();
        System.out.println("device id: "+device.getDeviceId());
        OutputDataToESP output = new OutputDataToESP(fields[0], 0.0, 0.0);

        if(device.getData().getTemperature().equals(mappedTemp)){
            output.setWaterLower(device.getData().getWaterLower());
            output.setWaterUpper(device.getData().getWaterUpper());
            return output;
        }
        Data newdata = updateDeviceTemperature(fields[0], mappedTemp);
        output.setWaterLower(newdata.getWaterLower());
        output.setWaterUpper(newdata.getWaterUpper());
        return output;
    }
    public void deleteall(){
        deviceRepository.deleteAll();
    }
    public List<Device> getAll(){
        return deviceRepository.findAll();
    }
}