package com.example.demoweb.model;

import java.util.Date;

public class Post {
    public Post(long _id, String _text, Date _date, Integer _likes){
        this.id = _id;
        this.text = _text;
        this.likes = _likes;
        this.creationDate = _date;
    }
    private Long id;
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
    public Long getId(){
        return this.id;
    }
    public void setLikes(Integer value){
        if(value >= 0){
            this.likes = value;
        }
    }
}
