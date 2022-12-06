package Day34_InterviewPractiseString;

public class Topic5_StringRelatedQuestions {


    public static void main(String[] args) {

        String s= "ThisisMonday".substring(4);
        System.out.println("JAVAISEASY!".substring(2,8).substring(1).charAt(2) );
    }
}

/*

Is String a keyword in Java?

No. String is not a keyword in Java.
String is a final class in java.lang package which is used to represent the set of characters in Java.


Is String a primitive type or Class?
String is a class.


In how many ways you can create string objects in Java?

String s = "MyString"; <- Auto boxing
String s = new String("MyString");

Why StringBuffer and StringBuilder classes are introduced in Java
when there already exist String class to represent the set of characters?

The objects of String class are immutable in nature.
If you try to modify them, a new object will be created with modified content.
This may cause memory and performance issues if you are performing lots of string modifications in your code.
To overcome these issues, StringBuffer and StringBuilder classes are introduced in Java.

What do you mean by immutable and mutable?

Immutable objects are like constants. You can’t modify them once they are created.
They are final in nature. Whereas you can perform modifications on mutable objects.

Which class do you recommend among String, StringBuffer and StringBuilder classes
if I want mutable and thread safe objects?
StringBuffer

----
String - > StringBuffer -> StringBuilder
---

What is the similarity and difference between String and StringBuffer class?

The main similarity between String and StringBuffer class is that both are thread safe.
The main difference between them is that String objects are immutable
whereas StringBuffer objects are mutable.

What is the similarity and difference between StringBuffer and StringBuilder class?

The main similarity between StringBuffer and StringBuilder class is that both produces mutable string objects.
The main difference between them is that StringBuffer class is thread safe
whereas StringBuilder class is not thread safe.

--- Type Casting
String s = "2022";
int year = Integer.parseInt(s);
int year = Integer.valueOf(s);

int year = 2019;
String s = String.valueOf(year);
String s = Integer.toString(year);

What is wrong with this code?
class MyStringClass extends String{   <- you can not extend String class as it is "final"
    String MyField;
}

--- What is output of the code questions.

String s= "ThisisMonday".substring(4);
sout(s);   <-  isMonday


String s = "Friday".replace("i", "0");  <- Fr0day
sout( s.substring(2,5)); <- 0da

String s= "Hello";  s = Hello
s.concat("Hi");     s = Hello
s.concat("Howdy");  s = Hello
sout(s);

String s = "123";  s = 123
sout( s.concat("123").concat("123")  );   "123".concat = "123123".concat("123") = "123123123"
sout(s) <- "123"


sout("OMG"+1000+2000+3000);
OMG + 1000 = OMG1000
OMG + 1000 + 2000= OMG10002000
OMG + 1000 + 2000 + 3000= OMG100020003000

sout(1000+2000+3000+"OMG") 6000OMG


sout(7.7+3.3+"ENOUGH"+3.3+7.7);  11.0ENOUGH3.37.7

sout( "JAVAISEASY!".substring(2,8).substring(1).charAt(2) );
   "JAVAISEASY!".substring(2,8)  =          VAISEA
   "VAISEA".substring(1) = "AISEA"











 */