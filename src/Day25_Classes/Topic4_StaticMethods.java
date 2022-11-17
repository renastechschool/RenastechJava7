package Day25_Classes;

public class Topic4_StaticMethods {
    public static void main(String[] args) {
        CupcakeMold MyCupCake = new CupcakeMold();
        MyCupCake.GetStyle();


//        CupcakeMold.GetStyle();
//        CupcakeMold.School
    }
}

class CupcakeMold{
    //Fields
    static String School = "RenasTech";

    /*
    static means that the field or method marked as such is available at the class level.
    In other words, you don't need to create an instance of the class to access it.

    So, instead of creating a copy of CupcakeMold then calling GetStyle() like this :
    CupcakeMold MyCupCake = new CupcakeMold();
    MyCupCake.GetStyle();

    You can call the method directly against the class, like so :
    CupcakeMold.GetStyle();

    The class is a Cupcake Mold
    and the object is the copy made with cupcake mold.
    A static method belongs to the Cupcake Mold and can be accessed directly without making any copies;
    hence, in the example above, we can use GetStyle() directly.
     */
    public static void GetStyle(){
        System.out.println("Tornado");
    }
}
