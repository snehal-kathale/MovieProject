package com.movie;

import java.util.List;

public class MovieFacade {
	public void addMovie(Movie movie) {
		MovieDao mv = new MovieDao();
		mv.insert(movie);
		List<Movie> movieinfo  = mv.getAllMovies();
		System.out.println("Movie List: ");
		for(Movie m : movieinfo) {
			System.out.println(m);
			}
		}
	public void getMovie() {
		MovieDao mv = new MovieDao();
		List<Movie> movieinfo  = mv.getAllMovies();
		System.out.println("Movie List: ");
		for(Movie m : movieinfo) {
			System.out.println(m);
		}
	}
	public void getMovieByActor(String Actor) {
		MovieDao mv = new MovieDao();
		Movie movie = mv.getMovie(Actor);
		System.out.println("Movies List with "+Actor+":"+ movie);
		
	}
}
