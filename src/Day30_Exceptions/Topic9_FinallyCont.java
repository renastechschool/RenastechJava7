package Day30_Exceptions;

public class Topic9_FinallyCont {
    public static void main(String[] args) {
        try{
            System.out.println("Do something");
        }catch (Exception e){
            e.printStackTrace();
        }
        finally {
            System.out.println("Finally");
        }

        // final, finally, finalize()

        // another code starts here
        System.out.println("No Finally");
    }
}
