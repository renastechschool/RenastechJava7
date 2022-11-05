package Day20_Methods;

public class Topic6_MethodParameters {

    public static void main(String[] args) {

        MyMethod("Nilufer",29);
        System.out.println("Cont from here");
        System.out.println("++++++++++++++++++");
        MyMethod("Amer",22);
        System.out.println("+++++++++++=");
        MyMethod("Nawras",30);
       // System.out.println("The name is: ");

    }

    public static void MyMethod(String name,int age){ // Input params - have to have the datatype and the name
        System.out.println("My name is: " +name);
        System.out.println("I am "+age+" years old");
    }
}
