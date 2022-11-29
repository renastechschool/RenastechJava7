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
            System.out.println("Open a File");
            /*
            do something about file
             */
        }finally {
            System.out.println("Close the file!");
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

        //Below combinations are wrong

        catch(){
        }
        try{
        }

        catch(){
        }
        finally{
        }


        try{
        }
        finally{
        }
        finally{
        }


        try{
        }

         */
    }
}
