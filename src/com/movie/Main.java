package com.movie;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MovieFacade movief = new MovieFacade();
		int i = 0;
		do{
			System.out.println("What would you like to do:");
			System.out.println("1. Add Movie");
			System.out.println("2. Search movie with Actor name");
			System.out.println("3. See list of Movies.");
			System.out.println("0. Exit");
			i = sc.nextInt();
			switch(i) {
			case 1:
				System.out.print("Enter Movie Name : ");
//				String name1 = sc.next()
				String name = sc.next();
				System.out.print("Enter Actor Name : ");
				String actor = sc.next();
				System.out.print("Enter Actress Name : ");
//				String actress1 = sc.nextLine();
				String actress = sc.next();
				System.out.print("Enter Director Name : ");
//				String director1 = sc.nextLine();
				String director = sc.next();
				System.out.print("Enter Year Of Release : ");
				int yearOfRelease = sc.nextInt();
				movief.addMovie(new Movie(name, actor, actress,director,yearOfRelease));
				break;
			
			case 2:
				System.out.print("Enter Actor name : ");
				String actor2 =sc.next();
				movief.getMovieByActor(actor2);
				
				break;
			case 3:
				movief.getMovie();		
				break;
			case 0:
				break;
			default:
				System.out.println("Enter valid input:");
				break;
			}
		}while(i!=0);
	}
}
