package Day3_OperationsandStrings;

public class Topic3_ArtihmeticOperations {
    public static void main(String[] args) {

        // (+) Addition
        int num1 = 90;
        int num2 = 80;
        int num3 = num1+num2;
        System.out.println("The result is : "+num3);
        System.out.println(num1+num2);
        System.out.println("this is the result in different way: "+num1+num2);
        System.out.println("this is the result in different way: "+(num1+num2));

        int num4 = 300;
        float num5 = 98.56f;
        float num6 = num4+num5;
        System.out.println("the result is : "+num6);

        double num7 = 98.7654;
        int num8 = 900;
        double num9 = num7+num8;
        System.out.println("The result for double_int is = "+num9);

        //(-) subtraction

        int num10=67;
        int num11 = 9000;
        int result = num10-num11;
        System.out.println("the result is = "+result);

        //(*) multiplication
        int num12 = 95;
        int num13 = 98;
        int result1 = num13*num12;
        System.out.println("the result of multiplication is : "+result1);

        double num14 = 89.543;
        double num15 = 87;
        double result2= num14*num15;
        System.out.println("The result is :"+result2);

        // (/) division

        int num16 = 89;
        int num17 = 40;
        float nresult = (float)num16/num17;// (int/int)
        System.out.println(nresult);

        double num19 = 89.546453687;
        double num20 = 3.876;
        double result5 = num19/num20;// (double / double)
        System.out.println("the result 5 is : "+result5);

        // (%) modulus (mod) // get the remainder of the division

        int num21 = 98;
        int num22 = 3;
        int num23 = num21%num22;
        System.out.println("The result of mod : "+num23);

        double num24 = 90.45;
        double num25 = 8.56;
        double modresult = num24%num25;
        System.out.println("The mod result for double is: "+modresult);







    }
}
