package Day35_InterviewPractiseNumbers;

public class Topic1_CompressString {
    public static void main(String[] args) {
//        "AAABBBBBCCDDD"   -> "3A5B2C3D"
//        Write a method that compress given string.
        CompressString("AAABBBBBCCDDD");
        System.out.println("");
        System.out.println("*********");
        CompressString("aabcccaaa");
    }

    public static void CompressString(String param1){
//        "AAABBBBBCCDDD"  -> "3A5B2C3D"
        char[] MyCharArray = param1.toCharArray();  //"A A A B B B B B C C D D D"
        char MyChar = MyCharArray[0];
        int Count = 1;
        for (int i = 1; i < MyCharArray.length; i++) {
            // if they are equal increase the count
            if(MyChar == MyCharArray[i]){
                Count++;
            }
            else {
                //if they are not equal, print the result
//                System.out.print("3A");
                System.out.print( Count + Character.toString(MyChar)); // T = 84
                MyChar = MyCharArray[i];
                Count = 1;
            }
        }
//        System.out.println("3D");
        System.out.print( Count + Character.toString(MyChar));
    }
}
