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
        FirstStudent.AddHomeworkResult(5);
        FirstStudent.AddHomeworkResult(23);
        FirstStudent.AddHomeworkResult(80);


        StudentClass SecondStudent = new StudentClass();
        SecondStudent.Name = "George";
        SecondStudent.StudentNumber = "2";

        SecondStudent.AddHomeworkResult(90);
        SecondStudent.AddHomeworkResult(98);
        SecondStudent.AddHomeworkResult(87);

        if (FirstStudent.GetMean()>=70){
            System.out.println(FirstStudent.Name+" Passed");
        }
        else {
            System.out.println(FirstStudent.Name+" Failed");
        }

        if (SecondStudent.GetMean()>=70){
            System.out.println(SecondStudent.Name+" Passed");
        }
        else {
            System.out.println(SecondStudent.Name+" Failed");
        }









    }
}
