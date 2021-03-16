package com.katon.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.katon.workshopmongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
	
	

}
