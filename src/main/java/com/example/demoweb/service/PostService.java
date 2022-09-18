package com.example.demoweb.service;

import com.example.demoweb.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

@Service
public class PostService {
    private ArrayList<Post> posts = new ArrayList<>();
    public PostService(){
        posts = new ArrayList<>(Arrays.asList(new Post("Мужик",new Date(),4),
                new Post("Women",new Date(),5)));
    }

    public ArrayList<Post> listAllPosts(){
        return this.posts;
    }

    public void create(String text) {
        this.posts.add(new Post(text, new Date(), 0));
    }
}
