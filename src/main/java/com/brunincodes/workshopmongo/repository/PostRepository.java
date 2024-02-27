package com.brunincodes.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.brunincodes.workshopmongo.domain.Post;

@Repository
public interface PostRepository extends MongoRepository <Post, String> {

}
