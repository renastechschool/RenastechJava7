package Day24_ArrayList;

import java.util.ArrayList;

public class Topic4_RemoveElements {
    public static void main(String[] args) {
        ArrayList<String> RandomWords = new ArrayList<>(4);
        RandomWords.add("mud");
        RandomWords.add("rice");
        RandomWords.add("elastic");
        RandomWords.add("youth");


        /*
        To remove an element from the ArrayList, we can use remove() method of the ArrayList class.
        For example :
         */

        System.out.println(RandomWords);
        RandomWords.remove(RandomWords.indexOf("youth"));
        System.out.println("Modified ArrayList : "+RandomWords);

        System.out.println("----------------------");

        System.out.println(RandomWords);
        RandomWords.remove("mud");
        System.out.println("Modified ArrayList : "+RandomWords);

        System.out.println("----------------------");

        System.out.println(RandomWords);
        String ReturnOfRemoveIndex = RandomWords.remove(0);
        System.out.println(ReturnOfRemoveIndex);
        System.out.println("Modified ArrayList : "+RandomWords);


        System.out.println(RandomWords);
        boolean DidIRemoveTheMud = RandomWords.remove("mud");
        System.out.println(DidIRemoveTheMud);
        System.out.println("Modified ArrayList : "+RandomWords);



    }
}
