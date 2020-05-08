package com.ananass.backendtest.mock;

import com.ananass.backendtest.entities.Gps;

import java.util.Random;

public class GpsMocker {

    private Random rand = new Random();

    public Gps mockSingleGps(){
        return new Gps(rand.nextDouble(), rand.nextDouble());
    }
}
