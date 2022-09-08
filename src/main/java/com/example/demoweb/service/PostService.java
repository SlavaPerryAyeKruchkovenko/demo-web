package com.example.demoweb.service;

import com.example.demoweb.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

@Service
public class PostService {
    public ArrayList<Post> listAllPosts(){
        return new ArrayList<>(Arrays.asList(new Post("Мужик",new Date(),4),
                new Post("Women",new Date(),5)));
    }
}
