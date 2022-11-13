package Day17_ArraysCont;


import java.util.Scanner;

public class Topic1_ArraySumElements {

    // Write a code with following requirements'
    // user should be asked about how many numbers that is going add to array
    // user should be asked for each element for the array
    // find the sum of all the elements in array
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the number of elements would you like to add to Array:");
        int size = sc.nextInt();

        double [] numbers = new double[size];//{ 0.0, 0.0, 0.0, 0.0} assuming user enters 4;

        for (int i = 0; i < size ; i++) { // or I could put i < numbers.length

            System.out.println("Please enter the "+(i+1)+". number: "); // i = i+1;
            double num = sc.nextDouble();
            numbers[i] = num;

        }

        double sum = 0;
        for (int i = 0; i < numbers.length; i++) {

            sum = sum + numbers[i];

        }

        System.out.println("the sum of all the numbers in the array is: "+sum);


    }
}
