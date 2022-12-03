package Day33_StringBuilderAndFileOperations;

public class Topic1_StringBuilder {
    public static void main(String[] args) {
        String MyString = "Hello";

        MyString = MyString + " World";
        System.out.println(MyString);

        for (int i = 1; i <= 100; i++) {
            MyString = "This is the line";
            MyString = MyString + i;
            System.out.println(MyString);
        }

        //DataType VariableName = new Datatype()
        StringBuilder SB = new StringBuilder();
        SB.append("Hello");
        System.out.println(SB);
        SB.append(" World");
        System.out.println(SB);
        // Hello World
        // HeJavallo World

        SB.insert(2, "Java");
        System.out.println(SB);

        SB.replace(6,9, "What");
        System.out.println(SB);

        SB.delete(11,13);
        System.out.println(SB);

        SB.reverse();
        System.out.println(SB);

        int position = SB.indexOf("avaJ");
        System.out.println(position);

        System.out.println(SB.charAt(5));


    }
}
