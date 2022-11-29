package Day30_Exceptions;

public class Topic1_ExceptionsIntro {
    public static void main(String[] args) {
        System.out.println("This the line 5"); // This line executed

        try {
            // Your code will go here that you want to catch exception
            int AValue = 50/0; // This may throw an error
        }catch (Exception e){

            System.out.println("There was an exception!");
        }
        /*
        The below code for handling an exception.
        We need to memorize it.
        try {

        }catch (Exception e){

        }

         */

        System.out.println("Rest of the code");
    }
}
