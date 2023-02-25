package com.moviesAPI_mongo_db.movies.repositories;

import com.moviesAPI_mongo_db.movies.collections.Review;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewRepository extends MongoRepository<Review, ObjectId> {
}
