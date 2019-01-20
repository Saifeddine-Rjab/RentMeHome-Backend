package com.mass.RentMeHome.model;

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
	private String title;
	private List<Comment> comments;
	private int numberOfLikes;
	private int numberOfDisLikes;
	private int price;
	
	
	public Accommodation(String city, String address, int numberOfRooms, boolean furnished, List<String> images,
			String description, String title, List<Comment> comments, int numberOfLikes, int numberOfDisLikes,
			int price) {
		super();
		this.id = UUID.randomUUID().toString();
		this.city = city;
		this.address = address;
		this.numberOfRooms = numberOfRooms;
		this.furnished = furnished;
		this.images = images;
		this.description = description;
		this.title = title;
		this.comments = comments;
		this.numberOfLikes = numberOfLikes;
		this.numberOfDisLikes = numberOfDisLikes;
		this.price = price;
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


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public List<Comment> getComments() {
		return comments;
	}


	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}


	public int getNumberOfLikes() {
		return numberOfLikes;
	}


	public void setNumberOfLikes(int numberOfLikes) {
		this.numberOfLikes = numberOfLikes;
	}


	public int getNumberOfDisLikes() {
		return numberOfDisLikes;
	}


	public void setNumberOfDisLikes(int numberOfDisLikes) {
		this.numberOfDisLikes = numberOfDisLikes;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}
	
}
