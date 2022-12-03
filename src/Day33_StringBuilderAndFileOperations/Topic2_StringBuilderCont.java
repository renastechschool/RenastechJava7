package Day33_StringBuilderAndFileOperations;

public class Topic2_StringBuilderCont {
    public static void main(String[] args) {
        // String is immutable
        String word = "Henry";
        String NewWord = word.replace("e","a");
        System.out.println(NewWord);

        System.out.println("*****************");

        //String builder is mutable
        StringBuilder SB = new StringBuilder("Henry");
        SB.replace(1,2,"a");
        System.out.println(SB);
    }
}
