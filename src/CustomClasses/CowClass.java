package CustomClasses;

    /*
Inheritance is an important pillar of OOP(Object-Oriented Programming).
It is the mechanism in java by which one class is allowed to inherit the features(fields and methods)
of another class.
Important terminology:
Super Class: The class whose features are inherited is known as superclass(or a base class or a parent class).
Sub Class: The class that inherits the other class is known as a subclass(or a derived class, extended class, or child class).
The subclass can add its own fields and methods in addition to the superclass fields and methods.
Reusability: Inheritance supports the concept of “reusability”, i.e. when we want to create a new class
 and there is already a class that includes some of the code that we want, we can derive our new class
 from the existing class. By doing this, we are reusing the fields and methods of the existing class.
How to use inheritance in Java
The keyword used for inheritance is extends.
 */


public class CowClass extends OldMcDonaldAnimal{

    public void Milk(){

        System.out.println(AnimalName+": You will drink a Milk");
    }

    public CowClass(){
        NumberOfLegs = 4;
    }


    //                     Private methods can not be @override
    //                 Protected methods can be

////				   ONLY the instance methods can be overridden
////				   @Override annotation MUST be applicable
    // static, final, abstract,sycn..
    // final methods can not be override.
    // you can not override the constructor of super(Parent) class
////

    // OverLoading vs Override  = Override is used when we want to threat the parent method to have different
    // reaction when it is called from the child instance,
    // Overloading : We use overloading to use the same method for different input parameters and return types
    // it is for the same class methods.


}
