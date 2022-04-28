package com.microservice.movieinfoservice.models;

public class MovieSummary {
	
	private String Id; 
	private String title;
	private String overview;
	
	public MovieSummary(String Id, String title, String overview) {
		super();
		this.Id = Id;
		this.title = title;
		this.overview = overview;
	}
	
	public MovieSummary() {
		
	}

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getOverview() {
		return overview;
	}

	public void setOverview(String overview) {
		this.overview = overview;
	}
	
	

}



