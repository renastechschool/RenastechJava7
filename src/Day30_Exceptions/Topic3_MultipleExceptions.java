package Day30_Exceptions;

public class Topic3_MultipleExceptions {
    public static void main(String[] args) {
        try {
            int[] AnArray = {11,22,33};
            int MyValue = AnArray[6];
            System.out.println(MyValue);
        }catch (Exception MyException){
            System.out.println("We don't have a value for index 6 ");
        }
        System.out.println("Rest of the code");
    }
}
