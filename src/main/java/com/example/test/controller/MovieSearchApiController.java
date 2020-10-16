package com.example.test.controller;


import com.alibaba.fastjson.JSONObject;
import com.example.test.dao.MovieRepository;
import com.example.test.pojo.entity.MovieEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;


@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class MovieSearchApiController {


    @Autowired
    public MovieRepository movieRepository;


    @RequestMapping(value = "/search", produces = {"application/json;charset=UTF-8"})
    public ResponseEntity<Object> search(HttpServletRequest request, HttpServletResponse response) {
        String search = request.getParameter("search");
        JSONObject json = JSONObject.parseObject(search);
        List<MovieEntity> movie = movieRepository.findMovieEntitiesByType(json.get("movie_type").toString());
        return ResponseEntity.ok(movie);
    }
}


