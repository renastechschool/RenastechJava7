package Day15_NestedLoops;

public class Topic2_WhileandForNextedLoops {
    public static void main(String[] args) {

        int i = 0;
        while(i<10){

            //i++;
            System.out.println("The i value: "+i); // this code will get executed 10 times
            //i++;
            for(int j = 1;j<10;j++){

                System.out.println("\t for each i value: "+i+" j value "+j); // this code will get executed 90 times
                                                                    // for each i value it will get executed 9 times
            }
            i++;
        }

    }
}
