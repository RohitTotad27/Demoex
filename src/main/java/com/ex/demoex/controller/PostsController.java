package com.ex.demoex.controller;


import com.ex.demoex.models.Location;
import com.ex.demoex.models.Posts;
import com.ex.demoex.models.User;
import com.ex.demoex.service.PostsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;



@RestController
public class PostsController {


    @Autowired
    PostsService postsService;

    @RequestMapping("/post")
    public List<Posts> getAllPosts(){

      return postsService.getPosts();

    }

}
