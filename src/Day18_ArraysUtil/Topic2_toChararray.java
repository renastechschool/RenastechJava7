package Day18_ArraysUtil;

import java.util.Arrays;

public class Topic2_toChararray {

    public static void main(String[] args) {

        String name="This is + * ? Ziya Yilmaz";
        char [] ch=name.toCharArray(); // It returns to a char array with every single char in the String

        System.out.println("this is char arrays: "+ Arrays.toString(ch));
        // "R", 'R'
        String test = "This is a Test";
        String [] StrArray = test.split(""); // { "T","h","i","s"," ",......}
        char [] ChArray = test.toCharArray();// {'T','h','i'...........}

        char a = ChArray[0];

    }
}
