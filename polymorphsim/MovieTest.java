package polymorphsim;

import java.util.Scanner;

public class MovieTest {

    public static void main(String[] args) {

        Movie theMovie0 = Movie.getMovie("Adventure","Star wars");

        Movie theMovie = new Movie("Star Wars");            //polymorphism example
        Movie theMovie1 = new Adventure("spider man");      //polymorphism example
        Movie theMovie2 = new Comedy("kolpacino");          //polymorphism example

        theMovie0.watchMovie();

        theMovie.watchMovie();
        theMovie1.watchMovie();
        theMovie2.watchMovie();

        Scanner s = new Scanner(System.in);
        while (true){
            System.out.println("enter type 'A' for Adventure 'C' for Comedy 'S' for Science Fiction, or Q to quite");
            String type = s.nextLine();
            if("Qq".contains(type)){
                break;
            }
            System.out.println("enter movie title");
            String title = s.nextLine();
            Movie movie = Movie.getMovie(type,title);       //polymorphism in action      classtaki statik methodu çağırabilirim  getMovie()
            movie.watchMovie();                             //polymorphism in action
        }

    }


}
