package Day36_InterviewPracticeJava;

public class Topic1_Questions {
    public static void main(String[] args) {

    }
}

/*
What are the fundamental principles of object-oriented programming?
a) Inheritance

b) Abstraction

c) Polymorphism

d) Encapsulation

What do you mean by inheritance in Java?

Inheritance is one of the key principle of object-oriented programming. Through inheritance, one class can inherit the properties of another class. The class from which properties are inherited is called super class and the class to which properties are inherited is called subclass.

Does Java support multiple inheritance? If not, why?

To avoid ambiguity, complexity and confusion, Java does not support multiple inheritance. i.e. a class in Java can not extend more than one classes.
For example, if Class C extends Class A and Class B which have a method with same name, then Class C will have two methods with same name. This causes ambiguity and confusion for which method to use. To avoid this, Java does not supports multiple inheritance.

How do you restrict a member of a class from inheriting to its subclasses?

By declaring that member as a private. Because, private members are not inherited to subclasses.

Encapsulation : public, private, protected, default

Can a class extend itself?

No, a class can not extend itself.

What happens if both, super class and subclass, have a field with same name?

Super class field will be hidden in the subclass. You can access hidden super class field in subclass using super keyword.

What is the difference between super() and this()?

super() : It is a calling statement to super class constructor.

this() : It is a calling statement to same class constructor.


Do constructors have return type? If no, what happens if you keep return type for a constructor?

No, constructors in Java don’t have return type. If you keep return type for a constructor, it will be treated as a normal method and also compiler gives a warning saying that method has a constructor name.

What is no-arg constructor?

Constructor without arguments is called no-arg constructor. Default constructor in Java is always a no-arg constructor.

What is the constructor overloading? What is the use of constructor overloading?

A class can have any number of constructors. These constructors will have different list of arguments. It is called constructor overloading. Constructor overloading provides different ways to instantiate a class.

What is the difference between constructor and method?

Constructor is a special member of a class which is used to create the objects to the class. It is special because it will have same name as class. It will have no return type.

Method is ordinary member of a class which is used to implement some behavior of a class. It will have its own name and return type.

What are the differences between static and non-static methods?

Static method is common to all instances of a class. Static methods are stored in the class memory. Whereas non-static methods are stored in the object memory. Each instance of a class will have their own copy of non-static methods.

Can we declare main() method as private?

No, main() method must be public. You can’t define main() method as private or protected or with no access modifier. This is because to make the main() method accessible to JVM.

Can we declare main() method as non-static?

No, main() method must be declared as static so that JVM can call main() method without instantiating it’s class.

Can we change the return type of main() method?

No, the return type of main() method must be void only.

How many types of modifiers are there in Java?

Two types of modifiers are there in Java. They are,

Access Modifiers
Non-access Modifiers

What are access modifiers in Java?

These are the modifiers which are used to restrict the visibility of a class or a field or a method or a constructor. Java supports 4 access modifiers.

a) private : private fields or methods or constructors are visible within the class in which they are defined.

b) protected : Protected members of a class are visible within the package, but they can be inherited to subclasses outside the package.

c) public : public members are visible everywhere.

d) default or No-access modifiers : Members of a class which are defined with no access modifiers are visible within the package in which they are defined.

What are non-access modifiers in Java?

These are the modifiers which are used to achieve the functionalities other than the accessibility. For example,

a) static : This modifier is used to specify whether a member is a class member or an instance member.

b) final : It is used to restrict the further modification of a class or a method or a field. (

c) abstract : abstract class or abstract method must be enhanced or modified further.

d) synchronized : It is used to achieve thread safeness. Only one thread can execute a method or a block which is declared as synchronized at any given time.

Can a method or a class be final and abstract at the same time?

No, it is not possible. A class or a method can not be final and abstract at the same time. final and abstract are totally opposite in nature. final class or final method must not be modified further whereas abstract class or abstract method must be modified further.

Can we declare an abstract method as private?

No, abstract methods can not be private. They must be public or protected or default so that they can be modified further.

What is type casting?

When the data is converted from one data type to another data type, then it is called type casting. Type casting is nothing but changing the type of the data. Using type casting, only type of the data is changed but not the data itself.

What is auto-boxing and unboxing?

String s = new String("something")
String s = "something";  <- auto-boxing

Wrapping of primitive content into corresponding wrapper class object is called boxing. Unwrapping the wrapper class object into corresponding primitive content is called unboxing.

What is polymorphism in Java?

Polymorphism refers to any entity whether it is a method or a constructor or an operator which takes many forms or can be used for multiple tasks.

What is method overloading in Java?

When a class has more than one method with same name but different parameters, then we call those methods are overloaded. Overloaded methods will have same name but different number of arguments or different types of arguments.

How do compiler differentiate overloaded methods from duplicate methods?

Compiler uses method signature to check whether the method is overloaded or duplicated. Duplicate methods will have same method signatures i.e. same name, same number of arguments and same types of arguments. Overloaded methods will also have same name but differ in number of arguments or else in types of arguments.

Can we declare one overloaded method as static and another one as non-static?

Yes. Overloaded methods can be either static or non-static.

Is it possible to have two methods in a class with same method signature but different return types?

No, compiler will give duplicate method error. Compiler checks only method signature for duplication not the return types. If two methods have same method signature, straight away it gives compile time error.

In MyClass , there is a method called myMethod with four different overloaded forms. All four different forms have different visibility – private, protected, public and default. Is myMethod properly overloaded?

Yes. Compiler checks only method signature for overloading of methods not the visibility of methods.

Can we declare overloaded methods as final?

Yes, overloaded methods can be final.

In the below class, is constructor overloaded or is method overloaded or none of them?

public class A
{
    public A()
    {
        //-----> (1)
    }

    void A()
    {
        //-----> (2)
    }
}
None of them. It is neither constructor overloaded nor method overloaded. First one is a constructor and second one is a method.

Can an overloaded method be overridden?

Yes, we can override a method which is overloaded in super class.

What is method overriding in Java?

Modifying a super class method in the subclass is called method overriding. Using method overriding, we can change super class method according to the requirements of subclass.

What are the rules to be followed while overriding a method?

There are 5 main rules you should be kept in mind while overriding a method.
They are,

a) Name of the method must be same as that of super class method.

b) Return type of overridden method must be compatible with the method being overridden. i.e. if a method has primitive type as it’s return type then it must be overridden with primitive type only and if a method has derived type as it’s return type then it must be overridden with same type, or it’s subclass types.

c) You must not reduce the visibility of a method while overriding.

d) You must not change parameter list of a method while overriding.

e) You can not increase the scope of exceptions while overriding a method with throws clause.


What happens if we change the arguments of overriding method?

If we change the arguments of overriding method, then that method will be treated as overloaded not overridden.

Can we override private methods?

No, They are not at all inherited to subclass.

Is it possible to override non-static methods as static?

No. You can’t override non-static methods as static.

Abstract class must have only abstract methods. True or false?

False. Abstract methods can also have concrete methods.

Is it compulsory for a class which is declared as abstract to have at least one abstract method?

Not necessarily. Abstract class may or may not have abstract methods.

Can we declare abstract methods as static?

No, abstract methods can not be static.

Can interfaces have constructors?

No. Interfaces can’t have constructors;

Can we re-assign a value to a field of interfaces?

No. The fields of interfaces are static and final by default. They are just like constants. You can’t change their value once they got.

Can we declare an Interface with abstract keyword?

Yes, we can declare an interface with abstract keyword. But, there is no need to write like that. All interfaces in Java are abstract by default.

Can an interface extend a class?

No, an interface can’t extend a class. But it can extend another interface.

What is the use of final keyword in Java?

final keyword in Java is used to make any class or a method or a field as unchangeable. You can’t extend a final class, you can’t override a final method and you can’t change the value of a final field. final keyword is used to achieve high level of security while coding.

What is the main difference between abstract methods and final methods?

Abstract methods must be overridden in the subclasses and final methods are not at all eligible for overriding.

Can we declare constructors as final?

No, constructors can not be final.

How the exceptions are handled in Java? OR Explain exception handling mechanism in Java?

try, catch, finally, throw and throws

What is the difference between error and exception in Java?

Errors are mainly caused by the environment in which an application is running. For example, OutOfMemoryError happens when JVM runs out of memory. Whereas exceptions are mainly caused by the application itself. For example, NullPointerException occurs when an application tries to access null object.

try{
}
int year = 2022;
catch(){}
finally{}


Can we write only try block without catch and finally blocks?

try{
}
No, It shows compilation error. The try block must be followed by either catch or finally block. You can remove either catch block or finally block but not both


try{
    statement1;
    statement2;  <- an exception
    statement3;
}catch(){
}

No. Once a try block throws an exception, remaining statements will not be executed. control comes directly to catch block.

what are checked and unchecked exceptions in java?

Checked exceptions are the exceptions which are known to compiler. These exceptions are checked at compile time only. Hence, the name checked exceptions. These exceptions are also called compile time exceptions. Because, these exceptions will be known during compile time.

Unchecked exceptions are those exceptions which are not at all known to compiler. These exceptions occur only at run time. These exceptions are also called as run time exceptions. All subclasses of java.lang.RunTimeException and java.lang.Error are unchecked exceptions.

Does finally block get executed If either try or catch blocks are returning the control?

Yes, finally block will always be executed no matter whether try or catch blocks are returning the control or not.

Can we throw an exception manually? If yes, how?

Yes, we can throw an exception manually using throw keyword. Syntax for throwing an exception manually is
throw new NumberFormatException();

What is the use of throws keyword in Java?

If a method is capable of throwing an exception that it could not handle, then it should specify that exception using throws keyword. It helps the callers of that method in handling that exception.









 */

class A{
    int Year = 2022;

    int A(){
        System.out.println("A constractor");
        return 0;
    }

    void AMethod(){
        this.Year = 2003;
        super.toString();
        System.out.println("something");
    }
}

class B extends A{
    int Year = 2023;

    void Method1(){

        System.out.println(this.Year);
    }

    B(){
        //this is a constructor
        System.out.println("Base Constructor");
    }

    B(int param1){
        super();

        /* below code is wrong
        try{

        }
        int Year = 2022;  <- you can't have this here
        catch (Exception e){

        }
         */
    }


    static int MyMethod(){
        return 0;
    }

    double MyMethod(int a){
        return 0;
    }

    @Override
    void AMethod() {
        super.AMethod();
        super.Year = 2000;
        this.Year = 2001;
    }
}

abstract class C{
    void MyMethod (){
        System.out.println("MyMethod");
    }

    abstract void AMethod();
}

interface M{
    int Year = 2022;
}

class N implements M{
    void MyMethod(){
//        Year = 2023; I can't do this
    }
}

abstract interface AN{

}

interface IN extends AN, M{

}