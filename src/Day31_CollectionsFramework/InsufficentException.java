package Day31_CollectionsFramework;

public class InsufficentException extends Exception {
    String Message;

    public InsufficentException(){
        Message = "I'm Sorry! You don't have enough money in your account!";
    }
}
