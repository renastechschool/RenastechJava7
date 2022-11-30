package Day31_CollectionsFramework;

import java.util.ArrayList;
import java.util.HashSet;

public class Topic2_CollectionsIntro {
    public static void main(String[] args) {
        HashSet<String> MyMotors = new HashSet<>();

        MyMotors.add("Suzuki");
        MyMotors.add("Kawasaki");
        MyMotors.add("Honda");
        MyMotors.add("Suzuki"); // 2nd Suzuki
        MyMotors.add("Yamaha");
        MyMotors.add("Honda"); // 2nd Honda
        MyMotors.add("Ducati");
        MyMotors.add(null);

        System.out.println(MyMotors);

        HashSet<Integer> MyIntegers = new HashSet<>();
        MyIntegers.add(11);
        MyIntegers.add(5);
        MyIntegers.add(1);
        MyIntegers.add(5); // 2nd 5

        System.out.println(MyIntegers);

    }
}
