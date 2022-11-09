package Day22_MethodOverloadandWrapperClass;

public class RecapMethodOverload {

    public static void main(String[] args) {

        makeOrder("Double Double Burger");

        line();

        makeOrder("Cheese Burger");

        line();

        makeOrder("Double Double Burger","Strawberry Shake");

        line();

        makeOrder("Cheese Burger","Vanilla Shake","French Fries");

        line();

        makeOrder("Double Double Burger","Strawberry Shake","French Fries",2);

    }



    // In-N-Out

    // makeOrder

    private static void makeOrder(String burger){
        System.out.println(burger+ " is ready to Enjoy");
    }

    private static void makeOrder(String burger, String shake) {
        System.out.println(burger+ " and "+ shake +" are ready to Enjoy");
    }

    private static void makeOrder(String burger, String shake, String fries) {
        System.out.println(burger+ " and "+ shake +" and "+fries+" are ready to Enjoy");
    }

    private static void makeOrder(String burger, String shake, String fries, int numberOfOrder) {
        for(int i=0;i<numberOfOrder;i++){
            System.out.println("Order Number: "+(i+1)+" "+burger+ " and "+ shake +" and "+fries+" are ready to Enjoy");
            line();
        }
    }

    public static void line(){
        System.out.println("---------------------------------------------");
    }
}
