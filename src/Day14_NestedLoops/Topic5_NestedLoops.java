package Day14_NestedLoops;

public class Topic5_NestedLoops {

    public static void main(String[] args) {

        for (int i = 0; i < 2; i++) {

            System.out.println("this is the first Outer Loop value of i: "+i); // this code will get executed 3
            for (int j = 0; j < 3; j++) {
                System.out.println("\t this is second Outer/ first Inner Loop i: "+i+ " j: "+j); // this code will get executed 9

                for (int k = 0; k < 4; k++) {
                    System.out.println("\t \tthis second Inner Loop i:"+i+" j: "+j+" k:"+k); // this code will get executed 27

                }

            }

        }


    }
}
