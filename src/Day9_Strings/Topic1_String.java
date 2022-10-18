package Day9_Strings;

import java.util.Scanner;

public class Topic1_String {
    public static void main(String[] args) {
        String name = "Ziya";
        String name3 = "Ziya";
        String  name2 = "z";
        Scanner sc = new Scanner(System.in);
        String str1 = new String("Class1");
        String str3 = new String("Class1");
        String str2 = "Class1";

        /*
            in Java, string is an object that represents a sequence of characters.
            The java.lang.String class is used to create a string object.
            String name = "hsgdjahsdknaksdn";

            How to create a string object?
            There are two ways to create String object:

            1.By string literal
            String str= "Class"; // Pool
            String str2 = "Class";
            2.By new keyword
            String str1 = new String("Class1"); // heap memory
            String str4 = new String("Class1");
        */
        //create an string object
        // 1.By string literal
        //Java String literal is created by using double quotes.
        // For Example:
        //String str1="Hello";

        //Each time you create a string literal, the JVM checks the "string constant pool" first.
        // If the string already exists in the pool, a reference to the pooled instance is returned.
        // If the string doesn't exist in the pool, a new string instance is created and placed in the pool.

        String andy = "Hello";
        String Andrew = "Hello";
        String Sena = new String("Hello");
        String Ziya = new String("dvsdv");

        boolean isEqual = (andy == Andrew);
        System.out.println("are they equal: "+isEqual);

        System.out.println("Are the others equal: "+(Andrew == Sena));
    }
}
