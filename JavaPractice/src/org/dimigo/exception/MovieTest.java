package org.dimigo.exception;

public class MovieTest {
	public static void main(String[] args){
		try{
			Movie[] movies = {
					new Movie("앤트맨", 12),
					new Movie("사도", 12),
					new Movie("베테랑", 15)
			};
			int age = 13;
			for(Movie movie : movies){
				buyTicket(movie, age);
			}
			
		}
		catch(AgeCheckException e){
			System.out.println(e.getMessage());
		}
	}
	private static void buyTicket(Movie movie, int age) throws AgeCheckException{
		if(movie.getLimitAge() > age){
			throw new AgeCheckException(movie);
		}
		System.out.println(movie.getTitle()+" 영화 즐감하세요");
	}
}
