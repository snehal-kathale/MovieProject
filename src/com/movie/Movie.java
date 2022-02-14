package com.movie;

public class Movie {
	private String Name;
	private String Actor;
	private String Actress;
	private String Director;
	private int yearOfRelease;

	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getActor() {
		return Actor;
	}
	public void setActor(String actor) {
		Actor = actor;
	}
	public String getActress() {
		return Actress;
	}
	public void setActress(String actress) {
		Actress = actress;
	}
	public String getDirector() {
		return Director;
	}
	public void setDirector(String director) {
		Director = director;
	}
	public int getYearOfRelease() {
		return yearOfRelease;
	}
	public void setYearOfRelease(int yearOfRelease) {
		this.yearOfRelease = yearOfRelease;
	}
	public Movie(String name, String actor, String actress, String director, int yearOfRelease) {
		super();
		Name = name;
		Actor = actor;
		Actress = actress;
		Director = director;
		this.yearOfRelease = yearOfRelease;
	}

	@Override
	public String toString() {
		return "Movie [Name = " + Name + ", Actor=" + Actor + ", Actress=" + Actress+" +Director = " +Director + "Year Of Realease" + yearOfRelease+ "]";
	}

	
	
}
