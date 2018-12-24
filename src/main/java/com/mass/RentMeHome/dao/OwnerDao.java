package com.mass.RentMeHome.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.mass.RentMeHome.model.Owner;

public interface OwnerDao extends MongoRepository<Owner, String>{

	@Query("{ 'email' : ?0 }")
	Owner findByEmail(String email);
}
