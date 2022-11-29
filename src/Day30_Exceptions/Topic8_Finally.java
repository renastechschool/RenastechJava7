package Day30_Exceptions;

public class Topic8_Finally {
    public static void main(String[] args) {
        try {
            // my code will go here
            int data = 10 / 5;
        }catch (ArithmeticException e){
            System.out.println("There is an exception");
        }finally {
            // After you execute the code in try block
            // come here and run below code
            // no matter you got an exception or not!
            System.out.println("This code is in Finally!");
        }

        try{

        }finally {

        }

        /*
        try{
        }
        catch(){
        }
        catch(){
        }
        finally{
        }


        try{
        }
        catch(){
        }
        catch(){
        }


        try{
        }
        finally{
        }

        catch(){
        }
        try{
        }

        catch(){
        }
        finally{
        }
         */
    }
}
