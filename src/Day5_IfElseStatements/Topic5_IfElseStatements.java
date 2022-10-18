package Day5_IfElseStatements;

public class Topic5_IfElseStatements {

    public static void main(String[] args) {
        /*
        if(condition){
            code block
        }else {

        another code block

        }
         */

        int a = 456;
        int b = 234;

        if(a>b){
            System.out.println("a is greater than b");
        }else{
            System.out.println("b is greater than a");
        }
        System.out.println("this is from outside of If-else statement");
    }
}
