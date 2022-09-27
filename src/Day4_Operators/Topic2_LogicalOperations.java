package Day4_Operators;

public class Topic2_LogicalOperations {


    public static void main(String[] args) {
        // AND ===> "&&" In order for the operation to result true all the operations should be true.
        boolean checklogic = true&&true;
        System.out.println("the logic is : "+checklogic);

        boolean logic1 = (78==90)&&(876 != 8907)&&(98>23);// false && true && true = false

        System.out.println("the logic1: "+logic1);

        boolean logic2 = false&&false&&false;
        System.out.println("the logic2: "+logic2);

        // OR ==> "||" in order have a true logical operation It is enough to have only one true.

        boolean logic3 = false||false||false||true;
        System.out.println("the logic3:"+logic3);

        boolean logic4 = !(!(90==90)||(90!=80)||(76>90));// !(false||true||false) == !(true)
        System.out.println("the result for logic4: "+logic4);

        boolean logic5 = ((89==89)&&(45>=23)||((67<=90)&&(true)));// true||(true)
        System.out.println("the answer for logic5: "+logic5);


    }
}
