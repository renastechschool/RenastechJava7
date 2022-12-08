package StudySession.Week12;

import java.util.ArrayList;
import java.util.LinkedList;

public class Week12_1 {

    public static void main(String[] args) {

        //Arraylist
        ArrayList<Integer> intArray = new ArrayList<>();

        intArray.add(1);
        intArray.add(2);
        intArray.add(3);
        System.out.println(intArray);
        //[1,2,3] -> [0,1,2,3]
        ArrayList<Integer> intArray2 = new ArrayList<>();
        intArray2.add(0);

        for(int element: intArray)
        {
            intArray2.add(element);
        }
        System.out.println("******");
        System.out.println(intArray2);
        System.out.println("******");

        //To retrieve the last element of the ArrayList
        System.out.println(intArray2.get(intArray2.size()-1));
        ArrayList<Integer> intArray3 = new ArrayList<>();

        for(int i=1; i<intArray2.size();i++)
        {
            intArray3.add(intArray2.get(i));


        }
        System.out.println("*****");
        System.out.println(intArray3);
        System.out.println("******");
        //LinkedList
        /*
		addFirst()	Adds an item to the beginning of the list.
		addLast()	Add an item to the end of the list
		removeFirst()	Remove an item from the beginning of the list.
		removeLast()	Remove an item from the end of the list
		getFirst()	Get the item at the beginning of the list
		getLast()	Get the item at the end of the list
		*/
        LinkedList<Integer> linkedArray = new LinkedList<>();

        linkedArray.add(1);
        linkedArray.add(2);
        linkedArray.add(3);

        System.out.println(linkedArray);
        linkedArray.addFirst(0);
        System.out.println(linkedArray);
        System.out.println(linkedArray.getLast());

        System.out.println("**********");
        System.out.println(linkedArray);
        linkedArray.removeFirst();
        System.out.println(linkedArray);
        System.out.println("**********");
    }

}
