package Day8_Scanners;

import Day7_SwitchStatements.Topic3_SwitchExample;

import java.util.Scanner;

public class Topic3_ScannerExample {

    // Write a code where it asks user to enter 3 different name (first name and last name)
    // and the age, print the person's name and age who is the oldest.

    public static void main(String[] args) {

        //Topic3_SwitchExample example = new Topic3_SwitchExample();

        Scanner scan = new Scanner(System.in);
        // First Person information
        System.out.println("Please enter first person's name: ");
        String name1 = scan.nextLine();
        System.out.println("Please enter first person's age: ");
        int age1 = scan.nextInt();scan.nextLine();


        // Second person information
        System.out.println("Please enter second person's name: ");
        String name2 = scan.nextLine();
        System.out.println("Please enter second person's age: ");
        int age2 = scan.nextInt();scan.nextLine();

        // Third person information
        System.out.println("Please enter third person's name: ");
        String name3 = scan.nextLine();
        System.out.println("Please enter third person's age: ");
        int age3 = scan.nextInt();

        /*System.out.println("The first person info==> Name: "+name1+" age"+age1);
        System.out.println("The second person info==> Name: "+name2+" age"+age2);
        System.out.println("The first person info==> Name: "+name3+" age"+age3);
        */
        if(age1>age2 && age1>age3){
            System.out.println("the oldest person is: "+name1+ " and the age is: "+age1);
        }else if(age2>age1 && age2>age3){
            System.out.println("the oldest person is: "+name2+" and the age is: "+age2);
        }else if(age3>age1 && age3>age2){
            System.out.println("the oldest person is: "+name3+" and the age is: "+age3);
        }else{
            System.out.println("there is no oldest one 1 person in group");
        }


    }

}
