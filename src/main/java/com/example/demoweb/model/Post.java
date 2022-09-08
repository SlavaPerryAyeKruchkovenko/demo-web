package com.example.demoweb.model;

public class Post {
    public Post(String _text, Integer _likes){
        this.text = _text;
        this.likes = _likes;
    }
    private String text;
    private Integer likes;

    public String getText(){
        return this.text;
    }

    public Integer getLikes(){
        return this.likes;
    }
}
