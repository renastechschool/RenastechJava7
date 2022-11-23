package Day28_InheritanceandAbstraction;

public class Topic4_AbstractClasses {
    public static void main(String[] args) {
//        Bakery MyBakery = new Bakery(); // you can not create a copy of an abstract class
//        CremeBrule MyCremeBrule = new CremeBrule(); // you can not create a copy of an interface too
        Danish MyDanish = new Danish();
    }
}

/*
Abstraction can be achieved with either abstract classes or interfaces.
Abstraction is the process of separating ideas from their action.
Interfaces are like skeletons. If you want to build a human, you should use that skeleton.
Abstract classes are like skeletons, but with some meat on them as well. It's just there to make your work easier.
You can consider an abstract class to be an interface, which already has some implementation.

You do abstraction when deciding what to implement.
You do encapsulation when hiding something that you have implemented.

Interfaces simply create a kind of structure for your classes to denote that your class should have a defined and agree-upon structure.
For example, all animals eat and make sounds. Thus you can have an interface,
called IAnimal which only mentions that classes should Eat, and MakeSound.

Abstract class: is a restricted class that cannot be used to create objects
(to access it, it must be inherited from another class).
Abstract method: can only be used in an abstract class, and it does not have a body.
 The body is provided by the subclass (inherited from).

 An abstract class can have both abstract and regular methods.

 */

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