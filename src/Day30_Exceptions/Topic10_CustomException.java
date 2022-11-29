package Day30_Exceptions;

public class Topic10_CustomException {
    public static void main(String[] args) {
        try{
            ValidateAge(15);
        }catch (NotEligibleToVoteException e){
            System.out.println(e.Message);
        }

        try{
            ValidateAge(19);
        }catch (NotEligibleToVoteException e){
            System.out.println("An Error Happened!");
        }

        try {

            ValidateAge(14);
        }catch (NotEligibleToVoteException e){
            //
        }


        try{
            throw new NoSuchFieldException();
        }catch (NoSuchFieldException e){
            System.out.println("I handled NoSuchFieldException");
        }


    }

    /*
    About exception handling you need to know below keywords

    try
    catch
    finally
    throw
    throws
     */

    public static void ValidateAge(int param1) throws NotEligibleToVoteException {
        if (param1 <18){
             throw new NotEligibleToVoteException("You can not vote!");
        }
        else {
            System.out.println("You can vote");
        }
    }
}

class NotEligibleToVoteException extends Exception{
    String Message;
    ///Please create a constructor for this class with one string parameter

    //public ClassName(Parameter1Type, Parameter1Name,......)
    public NotEligibleToVoteException(String param1){
        Message = param1;
    }
}

