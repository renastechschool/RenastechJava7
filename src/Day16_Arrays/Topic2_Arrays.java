package Day16_Arrays;

import com.sun.corba.se.impl.encoding.CDROutputObject;

public class Topic2_Arrays {

    public static void main(String[] args) {
        // We can define an array with a size but not add any values

        // DataType [] name = new DataType[size/length]

        int [] intArray = new int[4]; // {0,0,0,0} // this will populate intArray with 0 values
        // because the default value for int is 0
        // 0 is also default value for byte, short and long data type
        System.out.println("The index 0 value in intArray is: "+intArray[0]);
        System.out.println("The index 1 value in intArray is: "+intArray[1]);
        System.out.println("The index 2 value in intArray is: "+intArray[2]);
        System.out.println("The index 3 value in intArray is: "+intArray[3]);
        System.out.println("The index 4 value in intArray is: "+intArray); // this will return to a hashcode for intArray
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        double [] doubArray = new double[3]; // {0.0, 0.0, 0.0} because 0.0 is the default value of double
        // default value for double and float is 0.0
        System.out.println("The value of index 1 in doubArray: "+doubArray[1]);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        char [] charArray = new char[4];// { , , , }
        System.out.println("The default value of char"+charArray[1]);

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        String [] stringArray = new String[3]; // {null, null, null}
        System.out.println("the default value for String: "+stringArray[0]);

        // once array size or length is defined it can not be changed what you can do create another array and put all the values
        // in the new array

    }
}
