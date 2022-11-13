package Day21_MethodsAndMethodOverload;

public class MethodInterview {

    // Create a Method will print your name

    public static void main(String[] args) {
        //myName();
        String myName = "Baris";
        System.out.println(myName(myName));
    }

    private static String myName(String name){
        String newName= name+ " Ozer";
        return newName;
    }



}
