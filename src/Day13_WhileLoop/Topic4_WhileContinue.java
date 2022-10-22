package Day13_WhileLoop;

public class Topic4_WhileContinue {

    // print all the numbers between 1 and 10 except number 5,8,2

    public static void main(String[] args) {

        int i = 1;
        while(i<10){
            if(i==5 || i == 8 || i == 2){
                i++;
                continue;

            }
            System.out.println(" all the numbers: "+i);
            i++;
        }

        System.out.println("++++++++++++++++++++++++++++++++++");

        // print all the chars in the string "Nawras" except char 'a'
        String name = "Nawras";
        int j = 0;
        while(j<name.length()){

            if(name.charAt(j)=='a'){
                j++;
                continue;
            }

            System.out.println("The char at the index "+j+" is: "+name.charAt(j));
            j++;

        }

    }

}
