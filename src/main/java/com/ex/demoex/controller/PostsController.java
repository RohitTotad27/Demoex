package com.ex.demoex.controller;


import com.ex.demoex.models.Location;
import com.ex.demoex.models.Posts;
import com.ex.demoex.models.User;
import com.ex.demoex.service.PostsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @RequestMapping("/post/{id}")           //http://localhost:8080/post/p1 **USE p1 --> Post ID and not User Id**
    public Posts getPosts(@PathVariable("id")String id){

        return postsService.getPosts(id);

    }



    @RequestMapping(method = RequestMethod.POST,value = "/post")
    public void addPosts(@RequestBody Posts post){
        postsService.addPosts(post);
    }



}
