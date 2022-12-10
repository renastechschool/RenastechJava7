package Day37_InterviewPractice;

public class Topic1_Quiz {
    public static void main(String[] args) {
        int i = 11;
        i = i++ + ++i;


//        i = 11;
//         i= i++ + ++i;   11 + ++i   <- i = 12;
//        11 + ++i     11 + 13 = 24

//        i = 11 + 13

        System.out.println(i);


        int a = 11, b = 22, c;

        c = a + b + a++ + b++ + ++a + ++b;

//        c = 11 + 22 + 11;  a = 12;
//        c = 11 + 22 + 11 + 22;  a = 12;  b= 23;
//        c = 11 + 22 + 11 + 22 + 13;  a = 13;  b= 23;
//        c = 11 + 22 + 11 + 22 + 13 + 24;  a = 13;  b= 24;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);


        i = 0;
        i = i++ - --i + ++i - i--;
//        i = 0 - --i + ++i - i--;  i=1;
//        i = 0 - 0 + ++i - i--;  i=0;
//        i = 0 - 0 + 1 - i--;  i=1;
//        i = 0 - 0 + 1 - 1;  i=0;






    }
}
