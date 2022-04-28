package com.microservice.ratingsdataservice.models;

import java.util.List;

import com.microservice.ratingsdataservice.models.Rating;

public class UserRating {
	
	private List<Rating> userRating;

	public List<Rating> getUserRating() {
		return userRating;
	}

	public void setUserRating(List<Rating> userRating) {
		this.userRating = userRating;
	}
	
	

}
