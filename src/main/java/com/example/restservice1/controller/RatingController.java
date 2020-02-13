package com.example.restservice1.controller;

import com.example.restservice1.model.Rating;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rating")
public class RatingController {

    @GetMapping("/{movieId}")
    public Rating getRating(@PathVariable int movieId){
        return new Rating(movieId, 2);
    }
}
