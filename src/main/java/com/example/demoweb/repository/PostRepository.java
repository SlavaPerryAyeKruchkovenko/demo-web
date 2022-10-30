package com.example.demoweb.repository;

import com.example.demoweb.model.Post;
import org.springframework.data.repository.CrudRepository;
import javax.servlet.http.HttpServlet;

public interface PostRepository extends CrudRepository<Post, Long> {
}