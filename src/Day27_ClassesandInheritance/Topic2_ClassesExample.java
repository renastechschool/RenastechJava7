package Day27_ClassesandInheritance;

import CustomClasses.StudentClass;

public class Topic2_ClassesExample {
    public static void main(String[] args) {
        // we will create 2 students
        // we will give them some homeworks
        // we will point their homeworks
        // we will check if they passed or not

        StudentClass FirstStudent = new StudentClass();
        FirstStudent.Name = "Hayri";
        FirstStudent.StudentNumber = "1";
        FirstStudent.AddHomeworkResult(50);


        StudentClass SecondStudent = new StudentClass();
        SecondStudent.Name = "George";
        SecondStudent.StudentNumber = "2";


        String Something;
        Something = new String("test");
        System.out.println(Something);

        String s = "s";





    }
}
