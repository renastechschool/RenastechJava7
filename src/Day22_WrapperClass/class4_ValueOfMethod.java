package Day22_WrapperClass;

/*        valueOf methods: converting string to wrapper class value, returns wrapper class values
 */
public class class4_ValueOfMethod {
    public static void main(String[] args) {
        int number = Integer.valueOf("20");
        int number2 = Integer.valueOf("-20");
        Integer number3=Integer.valueOf("15");

        System.out.println(number);
        System.out.println(number2);
        System.out.println(number2+20);
        System.out.println(number3+15);

    }
}
