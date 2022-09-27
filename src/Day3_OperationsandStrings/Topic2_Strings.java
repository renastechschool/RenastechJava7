package Day3_OperationsandStrings;

public class Topic2_Strings {
    public static void main(String[] args) {

        // Strings are not primitive data type they are Non-primitive data type
        // Datatype name = a value;

        String name ="Ziya";
        System.out.println(name);

        String prag = "This is a paragraph. I wanted to put this as well";
        System.out.println(prag);

        String spc = "89673425hd+==#$%@";
        System.out.println(spc);

        String numbers="5678"; // this is not a number anymore, it us text
        System.out.println(numbers);
        // combine 2 text
        String txt1 = "This is text 1 ";
        String txt2 = "this is the text 2";
        String txt3 = txt1+txt2;
        System.out.println(txt3);

        String number2 = "98";
        String number3 = "80";
        String number4 = number2+number3;
        System.out.println(number4);

        System.out.println("This is hello world "+"This is the second hello world\t"+"this is third");

        int num = 89;
        System.out.println("This is the number from int: "+num);

    }
}
