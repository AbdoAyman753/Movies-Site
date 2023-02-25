package com.moviesAPI_mongo_db.movies.services;

import com.moviesAPI_mongo_db.movies.collections.Movie;
import com.moviesAPI_mongo_db.movies.repositories.MovieRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {
    @Autowired
    private MovieRepository movieRepository;
    public List<Movie> allMovies(){
        return movieRepository.findAll();
    }

//    public Movie singleMovie(ObjectId id) {
//        return movieRepository.findById(id).get();
//    }
    public Movie singleMovieByimdbId(String imdbId){
        return movieRepository.findMovieByImdbId(imdbId).get();
    }

}
