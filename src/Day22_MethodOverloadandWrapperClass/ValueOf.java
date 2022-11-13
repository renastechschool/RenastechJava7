package Day22_MethodOverloadandWrapperClass;

import static Day22_MethodOverloadandWrapperClass.RecapMethodOverload.line;

public class ValueOf {

    public static void main(String[] args) {

        String str = "20";
        System.out.println(str+10);

        line();

        int number = Integer.valueOf("20");
        int number2 = Integer.valueOf("-20");


        System.out.println(number+10);
        System.out.println(number+number2);
    }
}
