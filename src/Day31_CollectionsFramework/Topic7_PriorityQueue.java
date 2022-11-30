package Day31_CollectionsFramework;

import java.util.PriorityQueue;

public class Topic7_PriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<String> MyQueue = new PriorityQueue<>();

        MyQueue.offer("Welcome");
        MyQueue.offer("To");
        MyQueue.offer("Java");
        MyQueue.offer("4");
        MyQueue.offer("Testers");

        //4
        //Java
        //Testers
        //To
        //Welcome

        System.out.println(MyQueue);

        System.out.println("************");
        //poll
        while (!MyQueue.isEmpty()){
            String s2 = MyQueue.poll();
            System.out.println(s2);
        }
        //4  got it and deleted
        //Java
        //Testers
        //To
        //Welcome

        //Java got it and deleted
        //Testers
        //To
        //Welcome


        //Testers
        //To
        //Welcome

    }
}
