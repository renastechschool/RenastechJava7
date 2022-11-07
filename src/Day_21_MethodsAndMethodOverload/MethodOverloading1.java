package Day_21_MethodsAndMethodOverload;

public class MethodOverloading1 {
     /*
      Three ways to overload a method
        In order to overload a method, the parameter list of the methods must differ in either of these:
        1. Number of parameters.
        For example: This is a valid case of overloading

        public static void add(int, int)
        public static void add(int, int, int)
        add(1,2,3)
        add(1,2)
        2. Data type of parameters.
        For example:
        public static void add(int, int)
        public static void add(int, float)
        add(1,1)
        add(1,1.3f)
        3. Sequence of Data type of parameters.
        For example:

        public static void add(int, float)
        public static void add(float, int)
        add(1.5f,3)
        add(3,4.5f
        Invalid case of method overloading:
        Parameters list doesn’t mean the return type of the method, for example if two methods have same name, same parameters and have different return type, then this is not a valid method overloading example. This will throw a compilation error.

        int add(int, int)
        float add(int, int)
     */

    public static void main(String[] args) {
        calculateNumbers(2,3);
        calculateNumbers(2,3,4);
        System.out.println(calculateNumbers(2,3.5));
        calculateNumbers(5.5,3);

    }
    public static void calculateNumbers(int num1,int num2){
        int total=num1+num2;
        System.out.println("Total is :"+total);
    }
    public static void calculateNumbers(int num1,int num2,int num3){
        int total=num1+num2+num3;
        System.out.println("Total is :"+total);
    }
    public static String calculateNumbers(int num1,double num2){
        double total=num1+num2;
        return "Total is : "+total;
    }
    /*
    public static double calculateNumbers(int var1,double var2){
        double total=var1+var2;
        return total;
    }
    this is invalid case beacuse the order is same
    */


    public static void calculateNumbers(double num1,int num2){
        //the diffrence between above function and this function  is sequence of parameters if you write the same orders with above function its gonna give error
        double total=num1+num2;
        System.out.println("Total is :"+total);
    }
}
