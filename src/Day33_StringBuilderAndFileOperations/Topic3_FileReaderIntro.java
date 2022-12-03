package Day33_StringBuilderAndFileOperations;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Topic3_FileReaderIntro {
    public static void main(String[] args) {
        /*
        Paths:
                 //Mac OS X: /Users/username/Desktop/foldername..../File
                //Windows: C:/Users/username/Desktop/foldername..../File
                //Linux: /home/username/Desktop/foldername..../File
         */
        //C:/Users/Hayri/Desktop/Day33/Test.txt

        //DataType VariableName = new DataType();
        try {
            FileReader MyReader = new FileReader("C:/Users/Hayri/Desktop/Day33/Test.txt");

            int c = MyReader.read();

            System.out.println((char)c);

        } catch (FileNotFoundException e){
            System.out.println("File not found!");
        } catch (IOException e2){
            System.out.println("There is a problem while reading!");
        }


    }
}
