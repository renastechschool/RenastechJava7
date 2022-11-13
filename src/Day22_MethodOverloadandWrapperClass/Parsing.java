package Day22_MethodOverloadandWrapperClass;

import java.util.ArrayList;

import static Day22_MethodOverloadandWrapperClass.RecapMethodOverload.line;

public class Parsing {

    // parse method: converts string of text to the primitives

    public static void main(String[] args) {

        String str ="1900";
        System.out.println(str+55);

        line();
        // parseInt

        int number = Integer.parseInt(str);
        System.out.println(number+55);

        line();
        // parseDouble

        String str2 = "5.55";
        double d = Double.parseDouble(str2);
        System.out.println(d+2.2);

        line();

        //parseBoolean

        String str3 = "TrUe";
        boolean bool1 = Boolean.parseBoolean(str3);
        System.out.println(bool1);

        line();
        int primitive = 5;
        Integer wrapper = new Integer(5);
        Integer wrapper2 = 5;

        ArrayList<Integer> myNumber = new ArrayList<Integer>();


    }


}
