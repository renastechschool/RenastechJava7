package Day20_Methods;

public class Topic9_MethodReturnType {

    public static void main(String[] args) {


        System.out.println("the food is: "+Kitchen("Tomatos","SeaSalt","OliveOils"));
        System.out.println("+++++++++++++++++++++++++++++++");
        int result = Sum2nums(45,23);
        System.out.println("the result is : "+result);
        System.out.println("+++++++++++++++++++++++++++=");
        System.out.println("The result also: "+Sum2nums(2,67));
        //return "This";

        String Name = "Ziya";
        String Lower = Name.toLowerCase();
        System.out.println("Print "+Lower); // ziya

    }

    public static String Kitchen(String Veggies,String Salt,String oil){
        String food = Veggies + Salt + oil;

        return "Menemen";
        /*
        Access Modifiers Specifiers Return Type(String, Int, Object, Array, List) MethodName(Params){
        code block

        retrun a value or a varible whic is the same data type with your Return type

        }
         */
    }

    public static int Sum2nums(int a, int b){

        int sum  = a+b;
        return sum; // return a+b; // return 12;
    }



}
