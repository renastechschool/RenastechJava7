package Day28_InheritanceandAbstraction;

public class Topic5_InterviewQuestions {

    /*
1- Can interfaces have constructors?
No. Interfaces can’t have constructors. They show 100% abstractness.


2- Can abstract classes have constructors?
Yes.


3) Can we declare an Interface with “abstract” keyword?
Yes, we can declare an interface with “abstract” keyword.
But, there is no need to write like that. All interfaces in java are abstract by default.
so it is redundant


4)Like classes, does interfaces also extend Object class by default?
No. Interfaces don’t extend Object class.


5)Can interfaces have static methods?
If you have a body, yes otherwise you can not create a static abstract methods.


6) Abstract class must have only abstract methods. True or false?
False. Abstract methods can also have regular methods.



7) Why final and abstract can not be used at a time?
Because, final and abstract are totally opposite in nature.
A final class or method can not be modified further where as abstract class or method must be modified further.
“final” keyword is used to denote that a class or method does not need further improvements.
“abstract” keyword is used to denote that a class or method needs further improvements.


8)Can we declare abstract methods as private?
No.Abstract methods can not be private.

9)Can we declare abstract methods as protected?
Yes.
     */
}
abstract interface ISomething{
    void DoSomething();

}

// SomeClass extends Object
//abstract  class SomeClass{
//    final abstract void SomeMethod();
//}