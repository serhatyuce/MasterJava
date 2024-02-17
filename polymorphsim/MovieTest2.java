package polymorphsim;

public class MovieTest2 {

    public static void main(String[] args) {

        Movie movie = Movie.getMovie("A","jaws");
        movie.watchMovie();

        Adventure jaws = (Adventure) Movie.getMovie("A","jaws");    //(Adventure) is for casting
        jaws.watchMovie();

        Object comedy = Movie.getMovie("C","Airplane1");
        Comedy comedyMovie = (Comedy) comedy;
        comedyMovie.watchMovie();

        var airplane = Movie.getMovie("C","Airplane2");
        airplane.watchMovie();

        var plane = new Comedy("Airplane3");
        plane.watchMovie();


    }

}
