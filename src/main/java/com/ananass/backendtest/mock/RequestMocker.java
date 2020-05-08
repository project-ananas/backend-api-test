package com.ananass.backendtest.mock;

import com.ananass.backendtest.entities.Request;

import java.time.LocalDateTime;
import java.util.Random;

public class RequestMocker {

    private LocationMocker locationMocker = new LocationMocker();
    private Random rand = new Random();

    public Request singleRequest(){

        Request req = new Request();
        req.setLocations(locationMocker.mockAmount(rand.nextInt(20)));
        req.setMessage("Test Request from: " + LocalDateTime.now().toString());
        req.setSuccess(true);

        return req;
    }
}
