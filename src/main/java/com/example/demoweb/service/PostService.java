package com.example.demoweb.service;

import com.example.demoweb.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;

@Service
public class PostService {
    public ArrayList<Post> listAllPosts(){
        return new ArrayList<>(Arrays.asList(new Post("Мужик",4), new Post("Women",5)));
    }
}
