package com.example.demoweb.model;

import java.util.Date;

public class Post {
    public Post(String _text, Date _date, Integer _likes){
        this.text = _text;
        this.likes = _likes;
        this.creationDate = _date;
    }
    private String text;
    private Integer likes;

    private Date creationDate;

    public Date getCreationDate(){
        return this.creationDate;
    }

    public String getText(){
        return this.text;
    }

    public Integer getLikes(){
        return this.likes;
    }
}
