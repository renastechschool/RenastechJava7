package Day21_MethodsAndMethodOverload;

public class MethodOverloading {

    /*
    Three ways to overload method
    In order to overloa a method, the parameter list of the method must different in either of those

    1. Number of parameters
    Valid case for overloading
    public static int add(int, int)
    public static int add(int, int, int)
    add(1,2)
    add(1,2,3)

    2. Data type of parameter
    public static int add(int, int)
    public static int add(int, float)
    add(1,2)
    add(1,1.3f)

    3.Sequence of parameter
    public static int add(float, int)
    public static int add(int, float)
    add(1.3f,2)
    add(1,1.3f)

     */

    public static void main(String[] args) {

        calculateNumbers(1,2);

        calculateNumbers(1,2,3);

        System.out.println(calculateNumbers(1, 1.5));

        System.out.println(calculateNumbers(2.5,1));

    }

    // test => void

    // methods => return types

    private static void calculateNumbers(int number1, int number2){
        int sum = number1+number2;
        System.out.println(sum);
    }

    private static void calculateNumbers(int number1, int number2,int number3){
        int sum = number1+number2+number3;
        System.out.println(sum);
    }

    private static String calculateNumbers(int number1, double number2){
        double sum = number1+number2;
        return "Total is equal to "+ sum;
    }

    private static String calculateNumbers(double number2,int number1){
        double sum = number1+number2;
        System.out.println(sum);
        return "Total is equal to "+ sum;
    }

}
