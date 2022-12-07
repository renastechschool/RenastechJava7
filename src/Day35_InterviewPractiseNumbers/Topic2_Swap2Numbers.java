package Day35_InterviewPractiseNumbers;

public class Topic2_Swap2Numbers {
    public static void main(String[] args) {
        // swap 2 numbers without using the 3rd variable

        int a = 5;
        int b = 18;

        System.out.println("a = "+a);
        System.out.println("b = "+b);

        // do something
        // (a+b)-a = b
        // (a*b)/a = b

        a = a+b;
        // a= 23
        // b= 18

        //b=5;
        b= a - b;
        // a= 23
        // b= 5

//        a=18;
        a= a - b;


        System.out.println("*******");
        System.out.println("a = "+a);
        System.out.println("b = "+b);
    }
}

