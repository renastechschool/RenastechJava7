package Day20_Methods;

public class Topic7_MethodParams {
    //  write a method which it takes 2 integers as params and prints the result of sum of those numbers

    public static void main(String[] args) {

        SumTwoNumbers(40,90);
        System.out.println("+++++++++++++++++++");
        SumTwoNumbers(92,45);

        System.out.println("++++++++++++++=");
        SumTwoNumbers(93,-123);
    }

    public static void SumTwoNumbers(int a,int b){
        int sum = a+b;
        System.out.println("The result is: "+sum);
    }


}
