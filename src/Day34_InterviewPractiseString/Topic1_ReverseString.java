package Day34_InterviewPractiseString;

import CustomClasses.StudentClass;

import java.util.ArrayList;

public class Topic1_ReverseString {
    public static void main(String[] args) {
        System.out.println(USingStringBuilder("This is an example"));
        System.out.println("*********");
        System.out.println(RegularWay("This is an example"));
        System.out.println("*********");
        System.out.println(RegularWayWithForEach("This is an example"));
    }

    public static String USingStringBuilder(String param1){
        StringBuilder SB = new StringBuilder(param1);
        SB.reverse();
        return SB.toString();
    }

    public static String RegularWay(String param1){
        char[] MyCharArray = param1.toCharArray();
        String ReversedString = "";
        for (int i = 0; i < MyCharArray.length; i++) {
            ReversedString = MyCharArray[i] + ReversedString;
        }

        return ReversedString;
    }

    public static String RegularWayWithForEach(String param1){
        char[] MyCharArray = param1.toCharArray();

        String ReversedString = "";

        for (char MyChar:MyCharArray) {
//            MyChar = MyCharArray[i]
            ReversedString = MyChar + ReversedString;
        }

        return ReversedString;

    }

}
