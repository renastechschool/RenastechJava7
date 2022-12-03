package Day33_StringBuilderAndFileOperations;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class Topic7_Example {
    public static void main(String[] args) {
        try{
            FileReader FR = new FileReader("C:/Users/Hayri/Desktop/Day33/top250.txt");
            BufferedReader MyReader = new BufferedReader(FR);

            ArrayList<Movie> Top250 = new ArrayList<>();



            String line = MyReader.readLine();

            while (line != null){
                //9.2  The Shawshank Redemption (1994)
                StringBuilder SB = new StringBuilder(line);
                // String s = new String("something")

                String Rating = SB.substring(0, 3);
                System.out.println("Rating : "+Rating);

                SB.delete(0,5);

                //The Shawshank Redemption (1994)

                int Position1 = SB.indexOf("(");
                String Movie = SB.substring(0, Position1 - 1);


                System.out.println("Movie : "+Movie);
                SB.delete(0, Position1);

                //(1994)

                String Year = SB.substring(1, 5);
                System.out.println("Year : "+Year);

                //Another way to get year
                //int Position2 = SB.indexOf(")");
                //String Year = SB.substring(1, Position2);

                Movie aMovie = new Movie();
                aMovie.MovieName = Movie;
                aMovie.Rating = Rating;
                aMovie.Year = Year;

                Top250.add(aMovie);

//                System.out.println(SB);
                line = MyReader.readLine();
            }

            System.out.println(Top250.size());
            System.out.println("*********************");
            PrintOldMovies(Top250);


        } catch (FileNotFoundException e){
            System.out.println("File Not Found!");
        } catch (IOException e) {
            System.out.println("Error while reading file");
        }
    }

    ///please create a method that takes an arraylist of movie as parameter and prints movies that older than 1999
    ///method name = PrintOldMovies
    /// return type  = void
    // publicorprivate staticornot returntype methodname(parameter1type parameter1name, ........)
    public static void PrintOldMovies(ArrayList<Movie> param1){
        // prints movies that older than 1999
        for (Movie MyMovieInTheList:param1) {
            if(Integer.parseInt(MyMovieInTheList.Year) < 1999 ){
                System.out.println(MyMovieInTheList.MovieName);
            }

        }
    }


}

class Movie {
    String Year;
    String MovieName;
    String Rating;
}