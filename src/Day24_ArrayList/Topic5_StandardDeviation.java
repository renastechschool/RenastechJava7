package Day24_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Topic5_StandardDeviation {
    public static void main(String[] args) {
        ArrayList<Integer> MyDataSet = new ArrayList<>();
//        For example, a set of test scores is 10, 8, 10, 8, 8, and 4.

        MyDataSet.add(10);
        MyDataSet.add(8);
        MyDataSet.add(10);
        MyDataSet.add(8);
        MyDataSet.add(8);
        MyDataSet.add(4);

        int n = MyDataSet.size();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + MyDataSet.get(i);
        }
        System.out.println("Sum : "+sum);

        int mean = sum / n;

        System.out.println("Mean : " + mean);

        CalculateVarianceArrayList(MyDataSet, mean);
    }

    /// This method will calculate Variance of given array list
    /// @MyDataSet = this is an Arraylist that you will pass your Data Set
    /// @mean = this is an int that you will pass your calculated mean value
    public static ArrayList<Integer> CalculateVarianceArrayList (ArrayList<Integer> MyDataSet, int mean){
        ArrayList<Integer> Variance = new ArrayList<>(MyDataSet.size());

//        for (int i = 0; i <= param1.size()-1; i++) {
        for (int i = 0; i < MyDataSet.size(); i++) {
            Variance.set(i, MyDataSet.get(i) - mean);
        }

        return  Variance;
    }
}
