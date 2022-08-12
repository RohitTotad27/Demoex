package com.ex.demoex.controller;


import com.ex.demoex.models.Location;
import com.ex.demoex.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LocationsController {

    @Autowired
    LocationService location;

    @RequestMapping(value = "/locations")
    public List<Location> getAllLocations()
    {
        return location.getLocationList();
    }

    @RequestMapping("/locations/{id}")           //http://localhost:8080/post/p1 **USE p1 --> Post ID and not User Id**
    public Location getLocation(@PathVariable("id")String id){

        return location.getLocation(id);
    }

}
