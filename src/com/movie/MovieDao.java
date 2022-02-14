package com.movie;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.Statement;

public class MovieDao {
	static final String DB_URL = "jdbc:mysql://localhost:3306/movielib";
	static final String USER = "root";
	static final String PASS = "admin";
	public int insert(Movie movie) {
		int n = 0;
		try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
		         Statement stmt = conn.createStatement();
		      ) {		      
		          String sql = "CREATE TABLE MOVIE " +
		        		  "(Name VARCHAR(60), " +
		                   " Actor VARCHAR(20), " + 
		                   " Actress VARCHAR(20), " + 
		                   " Director VARCHAR(20), " + 
		                   " YearOfRelease INTEGER)"; 

		         stmt.executeUpdate(sql);
		         System.out.println("Created table in given database...");   	  
		      } catch (SQLException e) {
		         e.printStackTrace();
		      } 
		try{
			Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
			PreparedStatement stmt = conn.prepareStatement("insert into MOVIE(Name,Actor,Actress,Director,YearOfRelease) values(?,?,?,?,?);");
		
			stmt.setString(1, movie.getName());
			stmt.setString(2, movie.getActor());
			stmt.setString(3, movie.getActress());
			stmt.setString(4, movie.getDirector());
			stmt.setInt(5, movie.getYearOfRelease());
			n = stmt.executeUpdate();
		}
		catch (SQLException e) {
					e.printStackTrace();
		}
		return n;
	}
	

	public List<Movie> getAllMovies(){
		List<Movie> movieinfo = new ArrayList<Movie>();
		try{
			Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
			Statement stmt = conn.createStatement();
			ResultSet r = stmt.executeQuery("Select * from Movie");
			while(r.next()) {
				Movie en = new Movie(r.getString(1),r.getString(2),r.getString(3),r.getString(4),r.getInt(5));
				movieinfo.add(en);
			}
	}catch (SQLException e) {
		e.printStackTrace();
	}
		return movieinfo;
	}
	public Movie getMovie(String Actor) {
		Movie movie = null;
		try {
			Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
			Statement stmt = conn.createStatement();
			ResultSet r = stmt.executeQuery("select * from Movie where Actor='"+Actor+"';");
			r.next();
			Movie en = new Movie(r.getString(1),r.getString(2),r.getString(3),r.getString(4),r.getInt(5));
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return movie;
	}



}