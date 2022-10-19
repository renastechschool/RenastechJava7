package Day10_StringMethods;

public class Topic3_ForLoop {
    /*

    for(starting point; end point;increase or decrease){
    Code Block


    }


     */
    public static void main(String[] args) {
        for(int i = 0;i<20;i++){
            System.out.println("the i value: "+i);
        }
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++=");
        for(int i = 10;i<=90;i+=10){ // i=i+10:
            System.out.println("the i values "+i);
        }

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++=");

        for (int i = 20; i >0 ; i--) { // i*=2
            System.out.println("The value of i: "+i);
        }
       // System.out.println("the value of i: "+i); this will error out because i is only accessible inside the loop

        // write a code where you calculate the sum of all the integer numbers between 0 to 20;
        int result = 0;
        for(int j = 0 ;j<20;j++){

            result = result+j; // result = 0 + 0 = 0
            //                                // result = 0+1 = 1
            //                                // result = 1+2 = 3
            //                                // result = 3+ 3= 6;
            //                                // result = 6+4= 10
            //                                // result = 0+1+2+3+4+5
            //System.out.println("the result for each iteration: "+result);

        }
        System.out.println("The END result is: "+result);




    }
}
