package com.mass.RentMeHome.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="accommodations")
public class Accommodation {
	
	@Id
	private String id;
	private String description;
	private int numberOfRooms;

}
