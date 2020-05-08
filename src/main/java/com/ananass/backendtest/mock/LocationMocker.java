package com.ananass.backendtest.mock;

import com.ananass.backendtest.entities.Location;

import java.util.ArrayList;
import java.util.Random;

public class LocationMocker {

    private Random random = new Random();

    private DeviceMocker deviceMocker = new DeviceMocker();
    private GpsMocker gpsMocker = new GpsMocker();

    public Location mockSingle(String name){
        Location location = new Location();
        location.setDevices(deviceMocker.mockAmount(random.nextInt(50)));
        location.setLocation(name);
        location.setGps(gpsMocker.mockSingleGps());
        location.setTotal(location.getDevices().size());


        return location;
    }

    public ArrayList<Location> mockAmount(int amount){
        ArrayList<Location> locations = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            Location loc = mockSingle("location"+i);
            locations.add(loc);
        }

        return locations;
    }
}
