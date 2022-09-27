package Day4_Operators;

public class Topic5_PrePostConditions {

    public static void main(String[] args) {
        int a = 46;
        int b = 43;
        System.out.println(a+b);

        // ++ is increment which is increasing by 1
        int num = 56;
        System.out.println(num++);
        // variable++ is post-condition
        System.out.println("the num value: "+num);
        int num2 = 23;
        System.out.println(num2++);
        System.out.println(num2);

        // ++variable increase and assign

        int num3 = 81;
        System.out.println(++num3);

        // (--) decrement

        int num4 = 63;
        System.out.println(num4--);

        int num5 = 37;
        System.out.println(--num5);

    }
}
