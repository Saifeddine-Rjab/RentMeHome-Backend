package com.mass.RentMeHome.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.mass.RentMeHome.model.Accommodation;

public interface AccommodationDao extends MongoRepository<Accommodation, String>{

}
