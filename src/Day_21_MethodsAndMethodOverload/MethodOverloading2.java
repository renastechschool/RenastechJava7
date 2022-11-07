package Day_21_MethodsAndMethodOverload;

public class MethodOverloading2 {


    public static void main(String[] args) {
        makeOrder("Cheese Burger");
        System.out.println("---------------------------------------");
        makeOrder("Double Cheese Burger","Diet Pepsi");
        System.out.println("---------------------------------------");
        makeOrder("Double Double Burger","Math And Dew","Small");
        System.out.println("---------------------------------------");
        makeOrder("Chicken Burger","Coca Cola","Medium",2);
        System.out.println("---------------------------------------");
        System.out.println(makeOrder(3,"Cheese Burger","Coca Cola","Big"));


    }
    public static void makeOrder(String burger){
        System.out.println(burger+" is ready enjoy");
    }
    /*public static String makeOrder(String burger){
      return (burger+" is ready enjoy");
    }*/
    /*if you use two same parameter even though you change the method type it's not going to work
    the reason is compiler just looking parameter order and picking which method should work*/

    public static void makeOrder(String burgerName,String beverage){
        System.out.println(burgerName+" and "+beverage+ " is ready enjoy");
    }

    public static void makeOrder(String burgerName,String beverage,String frenchFries){//
        System.out.println(burgerName+", "+frenchFries+" French Fries and "+ beverage+ " is ready enjoy");
    }
    public static void makeOrder(String burgerName,String beverage,String frenchFries,int numberOfOrder){//
        for (int i=0;i<numberOfOrder;i++) {
            System.out.println("Order Number : "+ (i+1)+" "+burgerName + ", " + frenchFries + " French Fries and " + beverage + " is ready enjoy");
        }
    }
    public static String  makeOrder(int numberOfOrder,String burgerName,String beverage,String frenchFries){//
        String retValue="Order From Last Method\n";
        for (int i=0;i<numberOfOrder;i++) {
            retValue+=("Order Number : "+ (i+1)+" "+burgerName + ", " + frenchFries + " French Fries and " + beverage + " is ready enjoy\n");
        }/* Here we wrote exactly the same function as above the only difference is parameter sequence is the order of the parameters is
        if we write w method like the above two methods compiler can understand that which method is called */
        return retValue;
    }

}
