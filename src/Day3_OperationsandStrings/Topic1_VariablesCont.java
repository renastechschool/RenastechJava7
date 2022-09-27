package Day3_OperationsandStrings;

public class Topic1_VariablesCont {

    public static void main(String[] args) {
       /* Primitive Data Types:
        1) boolean ==> holds 2 values, true or false
        2) byte == > holds the whole number in range 0f -128 to 127
        3) char ==> holds the characters  for instance c, or R, or " or }
        4) short==> holds whole number in the range of -32768 to 32767
        5) int == > holds whole number
        6) long ==> holds the whole number
        6) float ==> holds decimal numbers up to 7 decimal digit
        7) double ==> holds decimal numbers up to 16 decimal digit
         */

        //short==> holds whole number in the range of -32768 to 32767

        // datatype name = a value
        short aNumber = -10000;
        System.out.println(aNumber);

        //  int == > holds whole number (Integer)
        int intNumber = 90000;
        System.out.println(intNumber);

        //long ==> holds the whole number

        long lnNmber = 789098l;
        System.out.println(lnNmber);

        int Number2 = 789;

        //6) float ==> holds decimal numbers up to 7 decimal digit

        float fnumber = 89.45f;
        System.out.println(fnumber);

        //) double ==> holds decimal numbers up to 16 decimal digit

        double dnumber=90.34537;
        System.out.println(dnumber);

        //double number = 78,98; will give you error. you can not use comma for the decimal points

        // declaring multiple variables on the same line.

        // data type name = a value

        int number4 = 70,number5=90,number6=98;
        double dnumber4,dnumber5,dnumber7;
        dnumber4=90.3456;
        System.out.println(number5);
        System.out.println(dnumber4);


    }
}
