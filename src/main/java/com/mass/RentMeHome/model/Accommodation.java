package com.mass.RentMeHome.model;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="accommodations")
public class Accommodation {
	
	@Id
	private String id;
	private String city;
	private String address;
	private int numberOfRooms;
	private boolean furnished;
	private List<String> images;
	private String description;
	
	public Accommodation(String city, String address, int numberOfRooms, boolean furnished,
			List<String> images, String description) {
		super();
		this.id = UUID.randomUUID().toString();
		this.city = city;
		this.address = address;
		this.numberOfRooms = numberOfRooms;
		this.furnished = furnished;
		this.images = images= new ArrayList<String>();
		this.description = description;
	}

	public Accommodation() {
		super();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getNumberOfRooms() {
		return numberOfRooms;
	}

	public void setNumberOfRooms(int numberOfRooms) {
		this.numberOfRooms = numberOfRooms;
	}

	public boolean isFurnished() {
		return furnished;
	}

	public void setFurnished(boolean furnished) {
		this.furnished = furnished;
	}

	public List<String> getImages() {
		return images;
	}

	public void setImages(List<String> images) {
		this.images = images;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
	
	
}
