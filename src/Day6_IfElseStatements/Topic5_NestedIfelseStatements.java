package Day6_IfElseStatements;

public class Topic5_NestedIfelseStatements {

    // write a code when the number is even and between 10 - 40 double the number and print it if not just
    // print the number
    // if it is odd and between 33-99 triple the number if not double the number and print the result
    public static void main(String[] args) {
        int number=109;

        if(number % 2 == 0){

           if(number>=10 && number<40){
               number = number*2;
               System.out.println("the result is: "+number);
           }else{
               System.out.println("the result is: "+number);
           }

        }else{
            if(number>=33 && number<99){
                number = number*3;
                System.out.println("the result is: "+number);
            }else{
                number= number*2;
                System.out.println("the result is: "+number);
            }

        }
    }
}
