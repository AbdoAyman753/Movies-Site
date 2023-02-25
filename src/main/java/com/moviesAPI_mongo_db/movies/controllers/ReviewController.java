package com.moviesAPI_mongo_db.movies.controllers;

import com.moviesAPI_mongo_db.movies.collections.Review;
import com.moviesAPI_mongo_db.movies.services.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/reviews")
public class ReviewController {
    @Autowired
    private ReviewService reviewService;

    @RequestMapping(method= RequestMethod.POST)
    public ResponseEntity<Review> createReview(@RequestBody Map<String,String> payload){
        return new ResponseEntity<Review>(reviewService.createReview(payload.get("reviewBody"), payload.get("imdbId")), HttpStatus.CREATED);
    }
}
