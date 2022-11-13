package Day14_NestedLoops;

public class Topic4_NestedLoopEX {

    public static void main(String[] args) {


        for (int i = 0; i < 3; i++) {           // when i = 0
                                                // i = 1
                                                // i = 2

            for (int j = 0; j < 3; j++) {
                                            // i = 0 j = 0
                                            // i = 0 j = 1
                                            // i = 0 j = 2
                                            // i = 1 j = 0
                System.out.println("For each "+i+" value "+" the j value is: "+j+" for each iteration");

            }

        }

    }
}
