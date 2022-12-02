package Day32_Maps;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Topic6_Example3{
    public static void main(String[] args) {
        /*
        Given an array of strings,
        return a Map<String, Boolean>
        where each different string is a key and its value is true if that string appears 2 or more times in the array.


        wordMultiple(["a", "b", "a", "c", "b"]) → {"a": true, "b": true, "c": false}

        wordMultiple(["c", "b", "a"]) → {"a": false, "b": false, "c": false}

        wordMultiple(["c", "c", "c", "c"]) → {"c": true}
         */
        ArrayList<String> MyLetters = new ArrayList<>();
        /*
        MyLetters.add("a");
        MyLetters.add("b");
        MyLetters.add("a");
        MyLetters.add("c");
        MyLetters.add("b");
         */
        //Below code same with above
        MyLetters.addAll(Arrays.asList("a", "b", "a", "c", "b"));

        System.out.println(MyLetters);
        System.out.println("*********");
        System.out.println(wordMultiple(MyLetters));

        System.out.println("--------------------------");

        //["c", "b", "a"]
        ArrayList<String> MyLetters2 = new ArrayList<>();
        MyLetters2.addAll(Arrays.asList("c", "b", "a"));
        System.out.println(MyLetters2);
        System.out.println("*********");
        System.out.println(wordMultiple(MyLetters2));

        System.out.println("--------------------------");


        //["c", "c", "c", "c"]
        ArrayList<String > MyLetters3 = new ArrayList<>();
        MyLetters3.addAll(Arrays.asList("c", "c", "c", "c"));
        System.out.println(MyLetters3);
        System.out.println("*********");
        System.out.println(wordMultiple(MyLetters3));



    }

    public static HashMap<String, Boolean> wordMultiple(ArrayList<String> param1){
        HashMap<String, Boolean> ReturnValue = new HashMap<>();

        //"a", "b", "a", "c", "b"
        //{}
        for (int i = 0; i < param1.size(); i++) {
            String Value = param1.get(i);
            // Check the count
            if (!ReturnValue.containsKey(Value)){
                ReturnValue.put(Value,false);
                // in the first iteration returnvalue = {}
            }else{
                ReturnValue.put(Value, true);
            }
        }

        return ReturnValue;
    }
}
