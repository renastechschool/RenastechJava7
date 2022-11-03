package StudySession.Week7;

public class Week7_2 {
    public static void main(String[] args) {

        String[][] testData = {{"taylantonka@gmail.com","1234"},{"renas@tech.com","5678"}};


        //find the max number of the array
        int[][] myNumbers = {{-1,-5,-9,-8},{-2,-3,-19,-87}};

        int maxNumber = myNumbers[0][0];
        //int maxNumber =0;
        for(int i =0; i<myNumbers.length;i++)
        {
            for(int j=0;j<myNumbers[i].length;j++)
            {
                if(myNumbers[i][j]>maxNumber)
                {
                    maxNumber = myNumbers[i][j];
                }
            }
        }

        System.out.println("maxNumber = " + maxNumber);


    }
}
