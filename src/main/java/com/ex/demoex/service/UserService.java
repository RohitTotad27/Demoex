package com.ex.demoex.service;

import com.ex.demoex.models.Location;
import com.ex.demoex.models.User;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class UserService {

    User user1 = new User(
            "u1",
            "Jany",
            "Lawrence",
            new Location("l1", "Lagos"),
            "Jany@gmail.com");

    User user2 = new User(
            "u2",
            "Jadon",
            "Mills",
            new Location("l2", "Asaba"),
            "Jadon@gmail.com");

    private List<User> users = new ArrayList<>(Arrays.asList(user1, user2));
    public List<User> getAllUsers() {

        return users;
    }

    public User getUser(String id){
        User user = users.stream()
                .filter(t->id.equals(t.getId()))
                .findFirst()
                .orElse(null);

        return user;
    }

    public void addUsers(User user){
        users.add(user);
    }

}
