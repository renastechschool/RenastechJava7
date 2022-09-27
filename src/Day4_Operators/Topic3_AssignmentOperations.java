package Day4_Operators;

public class Topic3_AssignmentOperations {

    public static void main(String[] args) {
        int a = 80;
        System.out.println("the a value is : "+a);

        a= 90; // a value is 90 now.
        System.out.println("the a value now is: "+a);

        a = a + 40;// get a value add 40 and assign back to a; // at this point a value is 130 a = 130
        System.out.println("the a value now is: "+a);

        a = a + 40;// this point a = 170
        System.out.println("the a value is now: "+a);
        a = 50000000;
        System.out.println("the a value is "+a);

        // a = a+40
        a+=40; // a = a + 40;
        System.out.println("the new value of a : "+a);

        int b = 100;

        b = b-30;
        System.out.println("the b value now is: "+b);

        b-=10;
        System.out.println("the new value of b: "+b);

        int theanswer = b-a;
        System.out.println("the theanswer: "+theanswer);


    }
}
