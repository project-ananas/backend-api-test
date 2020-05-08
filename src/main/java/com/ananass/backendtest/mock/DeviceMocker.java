package com.ananass.backendtest.mock;

import com.ananass.backendtest.entities.Device;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Timer;

public class DeviceMocker {

    private Random rand = new Random();

    private ArrayList<String> vendors(){
        ArrayList<String> vendors = new ArrayList<>();
        vendors.add("HTC");
        vendors.add("Samsung");
        vendors.add("Huawei");
        vendors.add("Apple");
        vendors.add("Motorola");
        vendors.add("Asus");
        vendors.add("Dell");

        return vendors;
    }

    public Device mockSingle(){
        Device device = new Device();

        device.setDevice("wifi-20:df:b9:49:1c:61");
        device.setVendor(vendors().get(rand.nextInt(vendors().size())));

        LocalDateTime dateTime = LocalDateTime.now().minusMinutes(rand.nextInt(15));
        device.setTimestamp(Timestamp.valueOf(dateTime));
        device.setProbability(rand.nextDouble());
        device.setRandomized(rand.nextBoolean());
        device.setNumScanners(rand.nextInt(6));
        device.setActiveMins(1440);
        device.setFirstSeen(Timestamp.valueOf(dateTime.minusMinutes(rand.nextInt(60))));
        return device;
    }

    public ArrayList<Device> mockAmount(int amount){
        ArrayList<Device> mockList = new ArrayList<>();

        for (int i = 0; i < amount ; i++) {
            Device device = mockSingle();
            mockList.add(device);
        }

        return mockList;
    }
}
