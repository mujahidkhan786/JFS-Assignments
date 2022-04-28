package com.microservice.moviecatalogservice.resources;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import com.microservice.moviecatalogservice.models.CatalogItem;
import com.microservice.moviecatalogservice.models.Movie;
import com.microservice.moviecatalogservice.models.Rating;
import com.microservice.moviecatalogservice.models.UserRating;
import com.microservice.moviecatalogservice.services.MovieInfo;
import com.microservice.moviecatalogservice.services.UserRatingInfo;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogResource {
	
	@Autowired
	private RestTemplate restTemplate;
	
	/*@Autowired
	private WebClient.Builder webClientBuilder;*/
	
	@Autowired
 	MovieInfo movieInfo;
	
	@Autowired
	UserRatingInfo userRatingInfo;
	
	@RequestMapping("/{userId}")
	public List<Object> getCatalog(@PathVariable ("userId") String userId) {
		
		//WebClient.Builder builder = WebClient.builder();
		
		/*RestTemplate restTemplate = new RestTemplate();
		String URL;
		restTemplate.getForObject(URL=  "http://localhost:8081/movies/foo", Movie.class );*/
		
		
		//get all rated movie ID
		/*String movieId;
		int rating;
		List<Rating> ratings = Arrays.asList(
				new Rating(movieId="1234", rating=4),
				new Rating(movieId="5678", rating=3)
				);*/
		
		//UserRating ratings = restTemplate.getForObject("http://ratings-data/ratingsdata/users/" + userId, UserRating.class);
		
		//return ratings.getUserRating().stream().map(rating -> {
			/// for each movie ID, call movie info service and get details
			//Movie movie = restTemplate.getForObject("http://info/movies/" + rating.getMovieId(), Movie.class);
			
			/*
			 * Movie movie = webClientBuilder.build() 
			 * .get() 
			 * .uri(s:"http://localhost:8082/movies/" + rating.getMovieId()) 
			 * .retrieve()
			 * .bodyToMono(Movie.class) 
			 * .block();
			 */
			
			// put them all together
			//return new CatalogItem(movie.getName(), movie.getDesc(), rating.getRating());
		
		UserRating userRating = userRatingInfo.getUserRating(userId);
		return userRating.getUserRating().stream()
				.map(rating -> movieInfo.getCatalogItem(rating))
		.collect(Collectors.toList());
	}
		
		//for each movie ID, call movie info service and get details
		
		//put them all together
				
				/*String name;
				String desc;
				int rating1;
				return Collections.singletonList(
						 new CatalogItem(name= "Transformers", desc= "Test", rating1= 4)
						);*/
	
	
	/*@HystrixCommand(fallbackMethod = "getFallbackCatalogItem")
	private CatalogItem getCatalogItem(Rating rating) {
		Movie movie = restTemplate.getForObject("http://info/movies/" + rating.getMovieId(), Movie.class);
		return new CatalogItem(movie.getName(), movie.getDesc(), rating.getRating());
	}
	
	private CatalogItem getFallbackUserRating(Rating rating) {
		return new CatalogItem("Movie name not found", "", Movie.getDesc(), rating.getRating());
	}

	
	@HystrixCommand(fallbackMethod = "getFallbackUserRating")
	private UserRating getUserRating(@PathVariable("userId") String userId) {
		return restTemplate.getForObject("http://ratings-data/ratingsdata/users/" + userId, UserRating.class);
	}
	
	private UserRating getFallbackUserRating(@PathVariable("userId") String userId) {
		UserRating userRating = new UserRating();
		UserRating.setUserId(userId);
		userRating.setRatings(Array.asList(
				new Rating("0", 0)
				));
		return userRating;
	}
	*/

}

