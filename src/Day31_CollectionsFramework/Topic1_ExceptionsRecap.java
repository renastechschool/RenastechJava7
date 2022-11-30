package Day31_CollectionsFramework;

public class Topic1_ExceptionsRecap {
    public static void main(String[] args) {
        // DataType VariableName = new Constructor(parameter defined in constructor)
        // DataType VariableName = new Datatype(parameter defined in constructor)

        BankAccount MyAccount = new BankAccount(100);

        MyAccount.Deposit(900);

        MyAccount.Withdrawal(1500);


    }
}
