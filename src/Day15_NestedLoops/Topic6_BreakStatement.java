package Day15_NestedLoops;

public class Topic6_BreakStatement {

    public static void main(String[] args) {

       LBL: // label
        for (int i = 0; i < 10; i++) {


            System.out.println("From Outer Loop i value: "+i);
            for (int j = 1; j < 10; j++) {
                if(i == 5){
                    break LBL; // breaks the outer loop to the label level
                }

                System.out.println("\t from the Inner Loop i: "+i+" j value: "+j);

            }

        }
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++");

        CON:
        for (int i = 0; i < 10; i++) {

            System.out.println("From Outer Loop the i value: "+i);
            for (int j = 1; j < 10; j++) {

                if(i == 5){
                    continue CON;
                }
                System.out.println("\t from Inner Loop the i value: "+i+" the j value: "+j);

            }

        }


    }
}
