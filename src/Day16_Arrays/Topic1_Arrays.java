package Day16_Arrays;

public class Topic1_Arrays {

    public static void main(String[] args) {
        // Variable:
        // DataType name = value;

        // Arrays: are the containers where they hold multiples in the same data types.
        // DataType [] name = {value1,value2, value3}
        int num1 = 78;
        int num2 = 23;

        int [] array1 = {78,23,91,34};

        // In arrays index starts from 0
        int [] array2 = {67,         90,         28,          10};
        // the index     index 0     index1      index2       index3

        // If I want to get the number in index 0, ==> array2[0]

        System.out.println("The first number in array is:  "+array2[0]);
        System.out.println("The second number in array is:  "+array2[1]);
        System.out.println("The third number in array is:  "+array2[2]);
        System.out.println("The fourth number in array is:  "+array2[3]);

        int var3 = array2[2];

        System.out.println("The var3 value is: "+var3);

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++");

        // Boolean data type arrays
        boolean [] BoolArray = {true,false,true,true};
        System.out.println("the value in index 3 in BoolArray is: "+BoolArray[3]);

        boolean var =BoolArray[1];
        System.out.println("The var value is : "+var);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++");
        // double data type arrays

        double [] DobArray = {90,65.8778,23}; // 90 = 90.000000
        System.out.println("The value in index 0: "+DobArray[0]);

        // String arrays
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++");
        String [] stringArraynames={"Cheesus","Harakar","Ziya","Nelly",null};
        System.out.println("The name is: "+stringArraynames[3]);
        System.out.println("The value of index 4: "+stringArraynames[4]);



    }
}
