package Day35_InterviewPractiseNumbers;

public class Topic3_BigONotation {
    public static void main(String[] args) {
        // Big O Notation
        // How long takes an algorithm to run

    // Constant Time Algorithms
    // O(1)

        int MyInteger = 29;
        System.out.println(MyInteger);

        // O(1)

//        Clearly, it doesn't matter what MyInteger is, above.
//        This piece of code takes a constant amount of time to run.
//        It's not dependent on the value of MyInteger.

        int MyInteger2 = 75;
        System.out.println("My integer value = "+MyInteger2);
        System.out.println("Yes it is "+MyInteger2);
        System.out.println("Ok, we know it is "+MyInteger2);

//        O(3) => O(1)

//      The above example is also constant time.
//      Even if it takes 3 times as long to run,
//      it doesn't depend on the size of the input, MyInteger2.
//        O(3) => O(1)
//      We don't care about exactly how long it takes to run,
//      only that it takes constant time.

//        O(n) Linear Time Algorithm
        int MyValue = 5;
        for (int i = 0; i < MyValue; i++) {
            System.out.println(i);
        }
//        O(n)

//      How many times does this for loop run? 5 times
//      This method runs in O(n) time , where n is the number of items in the array.
//      If the MyValue=10, we have to print 10 times.
//      If the MyValue=1000, we have to print 1,000 times.

//        O(n^2)   => O(n^p)
        int First = 5;
        int Second = 10;
        for (int i = 0; i < First; i++) {
            for (int j = 0; j < Second; j++) {
                System.out.println("Hello");
            }
        }
//        O(n^2)


//        Here we're nesting two loops.
//        If First = 5, our outer loop runs 5 times
//        If Second = 10, our inner loop runs 10 times for each iteration of the outer loop,
//        giving us 50 total prints.  O(5 * 10) != O(50)


//        if (i==5){
//            System.out.println("Hello");
//        }
//        O(1)
    }
}
