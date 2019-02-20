package com.mass.RentMeHome.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.mass.RentMeHome.model.Format;

public interface FormatDao extends MongoRepository<Format, String> {

}
