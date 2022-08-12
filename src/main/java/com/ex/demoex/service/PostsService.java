package com.ex.demoex.service;

import com.ex.demoex.models.Location;
import com.ex.demoex.models.Posts;
import com.ex.demoex.models.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class PostsService {

    User user1 = new User(
            "u2",
            "Rohit",
            "Totad",
            new Location("l2", "Bengaluru"),
            "rohittotad2745@gmail.com");

    Posts post1 = new Posts(
            "p1",
            "01-Jan-19",
            user1,
            "Its good to love and be loved");

     private List<Posts> posts = new ArrayList<>(Arrays.asList(post1));

         public List<Posts> getPosts(){

             return posts;
         }


         public Posts getPosts(String id){

             Posts post = posts.stream()
                     .filter(t->id.equals(t.getId()))
                     .findFirst()
                     .orElse(null);

            return post;
         }


    public void addPosts(Posts post) {

             posts.add(post);
    }
}
