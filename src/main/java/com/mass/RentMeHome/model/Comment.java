package com.mass.RentMeHome.model;

public class Comment {
	
	private int rating;
	private String comment;
	private String author;
	private String date;
	

	public Comment(int rating, String comment, String author, String date) {
		super();
		this.rating = rating;
		this.comment = comment;
		this.author = author;
		this.date = date;
	}

	public Comment() {
		super();
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
		
	
}
