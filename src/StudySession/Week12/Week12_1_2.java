package StudySession.Week12;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeSet;

public class Week12_1_2 {

    public static void main(String[] args) {
        //Set Interface

        //HashSet
        HashSet<Integer> setInteger = new HashSet<>();

        setInteger.add(-4);
        setInteger.add(2);
        setInteger.add(2);
       // setInteger.add(null);
        setInteger.add(3);
        setInteger.add(12);

        System.out.println(setInteger);


        //Treeset
        TreeSet<Integer> setTreeIntegers = new TreeSet<Integer>();
        setTreeIntegers.add(5);
        setTreeIntegers.add(3);
        setTreeIntegers.add(-2);
        setTreeIntegers.add(-11);

        System.out.println("*****");
        System.out.println(setTreeIntegers);
        System.out.println("*****");

        System.out.println(setTreeIntegers.descendingSet());

        //Map Interface

        HashMap<String,String[]> firstMap = new HashMap<>();

        String[] Canada = {"Toronto","Calgary","Vancouver"};
        String[] USA = {"New York", "Los Angeles", "Houstan"};

        System.out.println(Arrays.toString(Canada));

        firstMap.put("Canada",Canada);
        firstMap.put("USA",USA);

        String[] citiesofCanadaAndUSA;
















    }
}
