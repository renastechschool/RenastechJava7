package Day22_WrapperClass;

public class class1_WrapperClasses {

    //Primitive Data Types
    //byte
    //short
    //int
    //long
    //float
    //double
    //boolean
    //char

    ///non primitives object and objets are getting created by classes

    //Data Structure:
    //	1. Array
    //	2. Collection ==> only accepts objects
    //	3. Map ==>  only accepts objects
    //
    //	primitives: byte, short, int, long, float, double, char, boolean
    //
    //  wrapper classes:
    //		Byte, Short, Integer, Long, Float, Double, Character, Boolean

    //Java Wrapper Classes
    //Wrapper classes provide a way to use primitive data types (int, boolean, etc..) as objects.
    //
    //The table below shows the primitive type and the equivalent wrapper class:
    //
    //Primitive Data Type	Wrapper Class
    //byte	                Byte
    //short	                Short
    //int	                Integer
    //long	                Long
    //float	                Float
    //double	            Double
    //boolean	            Boolean
    //char	                Character
    //Sometimes you must use wrapper classes, for example when working with Collection objects, such as ArrayList,
    // where primitive types cannot be used (the list can only store objects):

    //Example
    //ArrayList<int> myNumbers = new ArrayList<int>(); // Invalid
    //ArrayList<Integer> myNumbers = new ArrayList<Integer>(); // Valid
    public static void main(String[] args) {
        Integer myInt = 5;// wrapper class object
        Double myDouble = 5.99;// wrapper class object
        Character myChar = 'A';// wrapper class object
        System.out.println(myInt);
        System.out.println(myDouble);
        System.out.println(myChar);
        System.out.println("--------------------");

        short shortVal=100; //primitive
        int val3=25;//primitive
        System.out.println(shortVal);
        System.out.println(val3);
        //Integer myInt=shortVal; //wrapper class object
        //Integer myInt2=myChar; // Integer is another form of int primitive data type
        //you can not assign different forms it has to be int


        Byte b1=11; // wrapper
        byte b2=13; // primitive
        Byte b3=b2; // wrapper


        System.out.println(b3);

        //== toString
        //we can use to convert wrapper objects to string
        Integer myInt2 = 100;
        System.out.println(myInt2);
        String myString = myInt2.toString();
        System.out.println(myString.length());


    }

}
