package Day22_MethodOverloadandWrapperClass;

import static Day22_MethodOverloadandWrapperClass.RecapMethodOverload.line;

public class WrapperClasses {

    public static void main(String[] args) {

        // Primitive Data Types
        // byte
        // int
        // short
        // long
        // float
        // double
        // boolean
        // char

        // Non Primitive object and object are getting created by classes

        // Primitive Classes     // Wrapper

        // byte                  // Byte
        // int                   // Integer
        // short                 // Short
        // long                  // Long
        // float                 // Float
        // double                // Double
        // boolean               // Boolean
        // char                  // Character


        int number = 5;

        System.out.println(number);

        Integer numbers = 5;

        System.out.println(numbers);

        numbers.toString();

        // Example

        // ArrayList<int> myNumber = new ArrayList<int>(); // invalid

        // ArrayList<Integer> myNumber = new ArrayList<Integer>(); // valid

        // [1,2,4,4]

        String name = ""; // non-primitive

        Character myChar = 'A'; // wrapper


        Byte b1 = 11; // wrapper
        byte b2 =12;  // primitive
        Byte b3 = b2; // wrapper

        line();

        // toString
        Integer myInt = 5;
        System.out.println(myInt);
        String myString = myInt.toString();
        System.out.println(myString.length());

        // Data Structure and Algorithm

    }
}
