package StudySession.Week11;

public class Exceptions {
    public static void main(String[] args) throws Exception {

        //Compile time error, ";" is missing
        //int x = 7

        String taylan = "Taylan";

        try {
            System.out.println( 7/0);
        }catch (StringIndexOutOfBoundsException e)
        {
            throw new StringIndexOutOfBoundsException();

        }catch (Exception SE)
        {
            System.out.println("********");
            throw new Exception();
        }




        System.out.println("Hello World");









    }
}
