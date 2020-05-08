package com.ananass.backendtest.controllers;

import com.ananass.backendtest.entities.Request;
import com.ananass.backendtest.mock.LocationMocker;
import com.ananass.backendtest.mock.RequestMocker;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class Controller {

    private RequestMocker requestMocker = new RequestMocker();

    @RequestMapping("/by_location")
    public ResponseEntity<Request> getByLocation(){
        return ResponseEntity.ok().body(requestMocker.singleRequest());
    }
}
