package Day28_InheritanceandAbstraction;

public class Topic4_AbstractClasses {
    public static void main(String[] args) {

    }
}

abstract class Bakery{
    String Name;
    public Bakery(){
        //this is your constructor
    }
    abstract void SetCreme();

    public void EatSomething(){
        System.out.println("You are eating something");
    }
}
//Can you have an abstract method in a non-abstract class
//No. Your class have to be abstract too
/*
class Watch{
    String Brand;
    abstract void PrintBrand(); //you can not have an abstract method in the non-abstract class
}
 */

class Danish extends Bakery{
    String taste;
    @Override
    void SetCreme() {

    }
    public void SetTaste(String param1){
        taste = param1;
    }
}

//Can interfaces have constructors?
//No. Interfaces can’t have constructors. They show 100% abstractness.
interface CremeBrule{
    String color = "Red";
    void Eat(); //This is an ABSTRACT method
}