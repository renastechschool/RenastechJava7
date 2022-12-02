package Day32_Maps;

import java.util.ArrayList;

public class Topic1_introtomaps {
    public static void main(String[] args) {

        ArrayList<String> MyEmployeeInformation = new ArrayList<>();

        MyEmployeeInformation.add("Eloise");
        MyEmployeeInformation.add("Elemen");
        MyEmployeeInformation.add("34");
        MyEmployeeInformation.add("120459863");

        PrintEmployee(MyEmployeeInformation);
    }

    /// please create a method that takes an Arraylist of String as parameter
    /// No return type
    /// Method name = PrintEmployee
    /// This method will print employee's name and age

    //PublicOrPrivate StaticOrNot ReturnType MethodName(Parameter1Type Parameter1Name, ........)

    public static void PrintEmployee(ArrayList<String> param1){
        System.out.println(param1.get(1));
        System.out.println(param1.get(3));
    }





}
