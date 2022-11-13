package Day15_NestedLoops;

public class Topic5_BreakandContinueSt {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {

            System.out.println("From Outer Loop the i value: "+i);
            for (int j = 1; j < 10; j++) {

                if(i == 5){
                    break;
                }
                System.out.println("\t from Inner Loop the i value: "+i+" the j value: "+j);

            }

        }

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        for (int i = 0; i < 10; i++) {

            System.out.println("From Outer Loop the i value: "+i);
            for (int j = 1; j < 10; j++) {

                if(j == 5){
                    break;
                }
                System.out.println("\t from Inner Loop the i value: "+i+" the j value: "+j);

            }

        }
    }
}
