package Day6_IfElseStatements;

public class Topic4_MultipleTernary {

    public static void main(String[] args) {
        /*  (condtion)?first:(condition)?:second:(contion)?third:forth;

         */
        // write a code where it checks if number is even or odd or zero
        // (a%2==0)?"The number is even":(a%2!=0)?"The number is odd":"The number is 0";
        int number1 = 70;
        String result = (number1==0)?"The number is Zero":(number1%2!=0)?"the number is odd":"The number is Even ";
        System.out.println(result);
    }
}
