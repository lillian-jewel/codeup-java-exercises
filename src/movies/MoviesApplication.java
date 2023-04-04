package movies;

import java.util.Scanner;
import static movies.MoviesArray.findAll;

public class MoviesApplication {
    public static void main(String[] args) {

        System.out.printf("0 - Exit, %n 1 - View all movies, %n 2 - View movies in the animated " +
                "category, %n 3 - View movies in the drama category, %n 4 - View movies in the horror " +
                "category, %n 5 - View movies in the sci-fi category, %n Please choose an option." +
                " %n "
        );

        Scanner option = new Scanner(System.in);
        int movieOption = option.nextInt();

        if (movieOption == 0) {
            System.out.println("Exit");
        } else if (movieOption == 1) {
            System.out.println("All movies");
            Movie[] movies = MoviesArray.findAll();
            for (Movie movie : movies) {
                System.out.println(movie.getName());
            }
        } else if (movieOption == 2) {
            System.out.println("Animated movies");
            Movie[] movies = MoviesArray.findAll();
            for (Movie movie : movies) {
                if (movie.getCategory().equals("animated")) {
                    System.out.println(movie.getName());
                }
            }
        } else if (movieOption == 3) {
            System.out.println("Drama movies");
            Movie[] movies = MoviesArray.findAll();
            for (Movie movie : movies) {
                if (movie.getCategory().equals("drama")) {
                    System.out.println(movie.getName());
                }
            }
        } else if (movieOption == 4) {
            System.out.println("Horror movies");
            Movie[] movies = MoviesArray.findAll();
            for (Movie movie : movies) {
                if (movie.getCategory().equals("horror")) {
                    System.out.println(movie.getName());
                }
            }
        } else if (movieOption == 5) {
            System.out.println("Sci-fi movies");
            Movie[] movies = MoviesArray.findAll();
            for (Movie movie : movies) {
                if (movie.getCategory().equals("scifi")) {
                    System.out.println(movie.getName());
                }
            }
        }
    }
}

