package Day23_MethodsOverloadWrapperRecap;

public class Topic4_MethodOverload {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;

        int sum = Add(a,b);

        double c = 1.2;
        double d = 1.5;

        double sum2 = Add(c,d);

        String s1 = "mere";
        String s2 = "bare";

        String result = Add(s1, s2);

        int e = 5;
        int f = 7;
        int sumplus1 = Add(e);
    }

    public static int Add(int param1, int param2){
       return param1 + param2;
    }

    public static int Add(int param3){
        return param3 + 1;
    }

    public static double Add(double param1, double param2){
        return  param1 + param2;
    }

    public static String Add(String param1, String param2){
        return param1 + param2;
    }


}
