package Day33_StringBuilderAndFileOperations;

import com.sun.xml.internal.ws.encoding.MtomCodec;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Topic5_BufferedReader {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileReader FR = new FileReader("C:/Users/Hayri/Desktop/Day33/Test.txt");
        BufferedReader MyReader = new BufferedReader(FR);

        String line = MyReader.readLine();
        System.out.println(line);
        System.out.println("**************");
        while (line != null){
            System.out.println(line);
            line = MyReader.readLine();
        }


    }
}
