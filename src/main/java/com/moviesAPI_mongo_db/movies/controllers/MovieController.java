package com.moviesAPI_mongo_db.movies.controllers;

import com.moviesAPI_mongo_db.movies.collections.Movie;
import com.moviesAPI_mongo_db.movies.services.MovieService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/movies")
public class MovieController {
    @Autowired
    private MovieService movieService;
    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<Movie>> getAllMovies(){
        return new ResponseEntity<>(movieService.allMovies(), HttpStatus.OK);
    }

//    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
//    public ResponseEntity<Movie> getSingleMovie(@PathVariable("id") ObjectId id){
//        return new ResponseEntity<>(movieService.singleMovie(id),HttpStatus.OK);
//    }
    @RequestMapping(value = "/{imdbId}",method = RequestMethod.GET)
    public ResponseEntity<Movie> getSingleMovieByImdbId(@PathVariable("imdbId") String imdbId){
        return new ResponseEntity<>(movieService.singleMovieByimdbId(imdbId),HttpStatus.OK);
    }
}
