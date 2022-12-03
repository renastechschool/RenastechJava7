package Day33_StringBuilderAndFileOperations;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Topic4_FileReader2 {
    public static void main(String[] args){
        try {
            FileReader FR = new FileReader("C:/Users/Hayri/Desktop/Day33/Test.txt");

            int c2;
            while ((c2 = FR.read()) != -1 ){
                System.out.print((char) c2);
            }

            /*
            int c = MyReader.read();

            while(c != -1){
                System.out.print((char)c);
                c = MyReader.read();
            }
             */
        }
        catch (FileNotFoundException e){
            System.out.println("File Not found!");
        }
        catch (IOException e){
            System.out.println("Error while reading file");
        }
    }
}
