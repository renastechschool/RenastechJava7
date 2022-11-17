package Day25_Classes;

public class Topic1_IntroToClasses {
    public static void main(String[] args) {
        String Car1Make = "Ford";
        String Car1Model = "Mustang";
        String Car1Color = "Red";

        PrintCar(Car1Make, Car1Model, Car1Color);

        System.out.println("--------------");
        String Car2Make = "BMW";
        String Car2Model = "M3";
        String Car2Color = "Black";

        PrintCar(Car2Make, Car2Model, Car2Color);

//        String MyString = "Something";  <= AutoBoxing
//        String MyString = new String("Something");
//        Integer MyInteger = 5;  <= AutoBoxing
//        Integer MyInteger = new Integer(5);
//        Double MyDouble = 1.2;  <= AutoBoxing
//        Double MyDouble = new Double(1.2);



        System.out.println("--------------");
        Car MySportsCar = new Car();
        MySportsCar.Make = "Subaru";
        MySportsCar.Model = "BRZ";
        MySportsCar.Color = "Blue";
        MySportsCar.ModelYear = 2021;

        PrintCarClass(MySportsCar);

    }

    /// This method will print Car specifications.
    /// @param1 is a Car class that will we use as our parameter
    public static void PrintCarClass(Car param1){
        System.out.println("Make : "+param1.Make);
        System.out.println("Model : "+param1.Model);
        System.out.println("Color : "+param1.Color);
        System.out.println("ModelYear : "+param1.ModelYear);
    }

    /// This method will print Car specifications.
    /// @param1 is a String parameter that we will use as Make name
    /// @param2 is a String parameter that we will use as Model name
    /// @param3 is a String parameter that we will use as Color name
    public static void PrintCar(String param1, String param2, String param3){
        System.out.println("Make : "+param1);
        System.out.println("Model : "+param2);
        System.out.println("Color : "+param3);
    }
}

class Car{
    //Fields
    String Make;
    String Model;
    String Color;
    int ModelYear;

}


