package Day12_BreakandContSt;

import java.util.Scanner;

public class Topic4_BreakStexample {
    public static void main(String[] args) {

        // User is being asked to enter a name restructure the name but as soon as it sees the "l" you should
        // stop restructure
        // Kyle == > Ky

        Scanner sc = new Scanner(System.in);
        System.out.println("please enter a name: ");
        String name = sc.next();

        String rename = "";
        for (int i = 0; i < name.length(); i++) {// H I B A == length =4

            //rename=rename+name.charAt(i); this will add l then break it

            if(name.charAt(i)=='l' || name.charAt(i)=='L'){
                break;
            }
            rename=rename+name.charAt(i);

        }
        System.out.println("The Rename value is: "+rename);

    }
}
