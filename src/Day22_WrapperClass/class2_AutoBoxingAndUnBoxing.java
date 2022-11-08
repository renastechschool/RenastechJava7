package Day22_WrapperClass;

public class class2_AutoBoxingAndUnBoxing {
    /*
    In Java, primitive data types are treated differently so do there comes the introduction of wrapper classes where two
     components play a role namely Autoboxing and Unboxing. Autoboxing refers to the conversion of a primitive value into
     an object of the corresponding wrapper class is called autoboxing. For example, converting int to Integer class.
     The Java compiler applies autoboxing when a primitive value is:

        Passed as a parameter to a method that expects an object of the corresponding wrapper class.
        Assigned to a variable of the corresponding wrapper class.
        Unboxing on the other hand refers to converting an object of a wrapper type to its corresponding primitive value. For example conversion of Integer to int. The Java compiler applies to unbox when an object of a wrapper class is:

        Passed as a parameter to a method that expects a value of the corresponding primitive type.
        Assigned to a variable of the corresponding primitive type.
        Primitive Type	Wrapper Class
        boolean	Boolean
        byte	Byte
        char	Character
        float 	Float
        int 	Integer
        long	Long
        short 	Short
        double	Double
        The following table lists the primitive types and their corresponding wrapper classes, which are used by the Java compiler for autoboxing and unboxing. Now let us discuss a few advantages of autoboxing and unboxing in order to get why we are using it.

        Autoboxing and unboxing lets developers write cleaner code, making it easier to read.
        The technique lets us use primitive types and Wrapper class objects interchangeably and we do not need to perform any typecasting explicitly.
*/
    public static void main(String[] args) {
        // Creating an Integer Object
        // with custom value say it be 10
        Integer i = new Integer(10);

        // Unboxing the Object
        int i1 = i;

        // Print statements
        System.out.println("Value of i:" + i);
        System.out.println("Value of i1: " + i1);

        // Autoboxing of character
        Character gfg = 'a';

        // Auto-unboxing of Character
        char ch = gfg;

        // Print statements
        System.out.println("Value of ch: " + ch);
        System.out.println(" Value of gfg: " + gfg);
    }


}
