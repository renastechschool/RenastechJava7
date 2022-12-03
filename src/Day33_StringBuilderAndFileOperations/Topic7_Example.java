package Day33_StringBuilderAndFileOperations;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Topic7_Example {
    public static void main(String[] args) {
        try{
            FileReader FR = new FileReader("C:/Users/Hayri/Desktop/Day33/top250.txt");
            BufferedReader MyReader = new BufferedReader(FR);

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

                System.out.println(SB);
                line = MyReader.readLine();
            }


        } catch (FileNotFoundException e){
            System.out.println("File Not Found!");
        } catch (IOException e) {
            System.out.println("Error while reading file");
        }
    }
}
