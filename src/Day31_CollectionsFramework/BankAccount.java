package Day31_CollectionsFramework;

public class BankAccount {
    double Balance;

    ///Please create a constructor that takes one double parameter

    //public ClassName(Parameter1Type Parameter1Name, .........)
    public BankAccount(double param1){
        Balance = param1;
    }

    ///Please create a method that takes a double as parameter
    /// No return
    /// This method will add the parameter value to you balance
    /// Method name = Deposit

    // PublicOrPrivate StaticOrNot ReturnType MethodName(Parameter1Type Parameter1Name, .........)
    public void Deposit(double param1){
        Balance = Balance + param1;
        // Below code same with above.
        // Balance += param1;
        System.out.println("Available Balance : "+Balance);
    }

    ///Please create a method that takes a double as parameter
    /// No return
    /// This method will subtract the parameter value from your balance
    /// Method name = Withdrawal

    // PublicOrPrivate StaticOrNot ReturnType MethodName(Parameter1Type Parameter1Name, .........)
    public void Withdrawal(double param1){
        if (Balance < param1){
            System.out.println("You don't have enough money");
        }
        else {
            Balance = Balance - param1;
            System.out.println("Available Balance : "+Balance);
        }
        // Below code same with above.
        // Balance -= param1;
    }

}
