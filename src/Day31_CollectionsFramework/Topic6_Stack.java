package Day31_CollectionsFramework;

import java.util.Stack;

public class Topic6_Stack {
    public static void main(String[] args) {
        Stack<String> MyStack = new Stack<>();

        //push() method
        // to add an element on top of the stack
        MyStack.push("Dog");
        MyStack.push("Horse");
        MyStack.push("Cat");

        System.out.println(MyStack);

        // peek() method
        // returns the element from the top of the stack
        String MyPeek =  MyStack.peek();
        System.out.println(MyPeek);


        //pop() method
        //removing the element (the element on top of the stack)
        System.out.println("*******************");
        // access and remove the element
        String MyPop = MyStack.pop();
        System.out.println(MyPop);
        System.out.println(MyStack);

        //search() method

        int Position = MyStack.search("Horse");
        System.out.println(Position);


        System.out.println("*******************");
        int Position2 = MyStack.search("Monkey");
        System.out.println(Position2);
    }
}
