package com.ex.demoex.service;


import com.ex.demoex.models.Location;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class LocationService {

    Location location1 = new Location("l1", "Bangalore");
    Location location2 = new Location("l2", "Belagavi");
    Location location3 = new Location("l3", "Tumkuru");

    public List<Location> locationList =new ArrayList<>((Arrays.asList(location1, location2, location3)));

        public List<Location> getLocationList(){
            return locationList;
        }

    public Location getLocation(String id) {
        Location location = locationList.stream()
                .filter(t -> id.equals(t.getId()))
                .findFirst()
                .orElse(null);

        return location;
    }

    public void addLocation(Location location) {
        locationList.add(location);
    }

}
