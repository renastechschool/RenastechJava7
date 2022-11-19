package Day26_ClassesandConstructors;

import CustomClasses.AnimalClass;
import CustomClasses.StudentClass;

public class Topic3_StudentExample {
    public static void main(String[] args) {
        StudentClass MyStudent = new StudentClass();
        MyStudent.Name = "Sefa";
        MyStudent.StudentNumber = "928";


        AnimalClass MyAnimal = new AnimalClass("Lion", "Cat");
        MyAnimal.AMethod("Something");
        System.out.println(MyAnimal.AnimalName);
        MyAnimal.AnimalName = "Leopar";
        System.out.println(MyAnimal.AnimalName + " " + MyAnimal.AnimalType);



        AnimalClass MyTiger = new AnimalClass("Tiger", "Cat");
        System.out.println(MyTiger.AnimalName);

        /*
        I don't need this code as I can define the name and Type on Creation
        MyAnimal.AnimalName = "Lion";
        MyAnimal.AnimalType = "Cat";

         */

        AnimalClass MyPenguin = new AnimalClass("Penguin", "Bird", "White-Black");
        System.out.println(MyPenguin.AnimalName+" "+MyPenguin.AnimalType+" "+MyPenguin.AnimalColor);
        /*
        I don't have to type below lines as we are assigning them in Constructor
        MyPenguin.AnimalName ="Penguin";
        MyPenguin.AnimalType ="Bird";
        MyPenguin.AnimalColor ="White-Black";
         */
    }
}
