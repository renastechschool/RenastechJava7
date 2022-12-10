package Day37_InterviewPractice;

public class Topic2_Fibonacci {
//    0 1 1 2 3 5 8 13 21 34 .......
//    a b ne
//    0 1 1 2 3 5 8 13 21 34 .......
//      a b ne
//    0 1 1 2 3 5 8 13 21 34 .......
//        a b ne
//    0 1 1 2 3 5 8 13 21 34 .......
//          a b ne

//    0 + 1 = 1         0 1 1
//    1 + 1 = 2         0 1 1 2
//    1 + 2 = 3         0 1 1 2 3
//    2 + 3 = 5         0 1 1 2 3 5

    public static void main(String[] args) {
        int a = 0;
        int b = 1;

        System.out.print(a+" ");
        System.out.print(b+" ");

        int HowMany = 20;

        for (int i = 2; i < HowMany; i=i+a) {
            int NextOne = a + b ;  // 1 <= 0 + 1    a = 0, b=1, nextone=1
            System.out.print(NextOne+" ");

            a = b;
            b = NextOne;
        }


    }


}
