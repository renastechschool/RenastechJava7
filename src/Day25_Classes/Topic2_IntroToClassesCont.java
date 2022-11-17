package Day25_Classes;

import java.util.Scanner;

public class Topic2_IntroToClassesCont {
    public static void main(String[] args) {
        StudentRegistrationForm MyForm = new StudentRegistrationForm();
        Scanner scan = new Scanner(System.in);

        System.out.println("Please Enter Your Name : ");
        MyForm.Name = scan.nextLine();

        System.out.println("Please Enter Your Surname : ");
        MyForm.Surname = scan.nextLine();

        System.out.println("Please Enter Your Age : ");
        MyForm.Age = scan.nextInt();

        System.out.println("Please Enter Your Gender : ");
        MyForm.Gender = scan.next();

        MyForm.PrintRegistrationForm();

    }

}

class StudentRegistrationForm{
    // Fields
    String Name;
    String Surname;
    int Age;
    String Gender;

    //Methods
    void PrintRegistrationForm(){
        System.out.println("Name : "+Name);
        System.out.println("Surname : "+Surname);
        System.out.println("Age : "+Age);
        System.out.println("Gender : "+Gender);
    }
}

