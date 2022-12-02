package Day32_Maps;

import java.util.HashMap;

public class Topic5_Example2 {
    public static void main(String[] args) {
        /*
        Given a map of food keys and topping values,
        modify and return the map as follows:

        if the key "ice cream" is present,
        set its value to "cherry". In all cases, set the key "bread" to have the value "butter".


        topping1({"ice cream": "peanuts"}) → {"bread": "butter", "ice cream": "cherry"}

        topping1({}) → {"bread": "butter"}

        topping1({"pancake": "syrup"}) → {"bread": "butter", "pancake": "syrup"}
         */

        HashMap<String,String> MyFood = new HashMap<>();
        MyFood.put("ice cream","peanuts");
        System.out.println(MyFood);
        System.out.println("*************");
        System.out.println(topping1(MyFood));
        System.out.println("--------------------------------");

        HashMap<String,String> MyFood2 = new HashMap<>();
        System.out.println(MyFood2);
        System.out.println("*************");
        System.out.println(topping1(MyFood2));

        System.out.println("--------------------------------");
        //{"pancake": "syrup"}
        HashMap<String,String> MyFood3 = new HashMap<>();
        MyFood3.put("pancake","syrup");
        System.out.println(MyFood3);
        System.out.println("*************");
        System.out.println(topping1(MyFood3));


    }
    public static HashMap<String,String> topping1(HashMap<String,String> param1){
        //if the key "ice cream" is present,

        if(param1.containsKey("ice cream")){
//            set its value to "cherry".
            param1.put("ice cream", "cherry");
        }

//        In all cases, set the key "bread" to have the value "butter".
        param1.put("bread", "butter");
        return param1;
    }
}
