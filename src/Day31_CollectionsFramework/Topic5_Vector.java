package Day31_CollectionsFramework;

import java.util.Vector;

public class Topic5_Vector {
    public static void main(String[] args) {
        Vector<Integer> MyNewVector = new Vector<>();

        // to change the all variable names at once, use Shift + F6, a popup will open
        MyNewVector.add(8476);
        MyNewVector.add(2);
        MyNewVector.add(8476);
        MyNewVector.add(4);
        MyNewVector.add(1);
        MyNewVector.add(1);
        MyNewVector.add(999);
        MyNewVector.add(null);
        MyNewVector.add(1794);

        System.out.println(MyNewVector);

        // If someone else tries to set index 2 at the same time, He/She will get an exception
        MyNewVector.set(2, 111);

        System.out.println(MyNewVector);
        /*
            In Java, ArrayList and Vector are almost the same.
            Vector is thread-safe, ArrayList is not.
            This means whenever we want to perform some operation on vectors,
            the Vector class automatically applies a lock to that operation.
            So at the same time, someone else can not change the value too.
            It is because when one thread is accessing a vector, and at the same time another thread tries to access it,
            an exception called "ConcurrentModificationException" is generated.

            Note:  If thread safety is not important
            It is recommended to use ArrayList instead of Vector because vectors less efficient.
         */
    }
}
