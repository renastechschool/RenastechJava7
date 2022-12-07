package Day35_InterviewPractiseNumbers;

public class Topic5_FindMissingPositiveNumber {
    public static void main(String[] args) {
        //  {3,8,4,9,1,7,5}   => 2
        //  {1,8,3,4,5,9,7}

        //  {1,2,3,4,5,6,7}   => 8

        //{-2,-9,0,55,6}
        //{-9,-2,0,6,55}

        int[] data = {3,8,4,9,1,7,5};
        System.out.println(UsingAnotherArray(data));
    }

    public static int SimpleMethod(int[] param1){
//        {3,8,4,9,1,7,5}
//        {1,3,4,5,7,8,9}

//        {-1, -2, -5, -6}
//        { -6,-5,-2,-1}
        int[] MySortedArray = new int[param1.length];

return 0;

    }

    public static int UsingAnotherArray(int[] param1){
//        {3,8,4,9,1,7,5}
//        {true, false, true, true, true,false, true  }
//        {1,    2,     3,    4,    5,   6,     7}
        boolean[] MyBooleanArray = new boolean[param1.length];

        for(int AValue : param1){
//            AValue = 3
//            MyBooleanArray[2] = true;
            if(AValue <= param1.length && AValue>0){
                MyBooleanArray[AValue -1] = true;
            }
        }

        for (int i = 0; i <MyBooleanArray.length ; i++) {
//            MyBooleanArray[0]  == true   <= I have number 1 in the array
//            MyBooleanArray[1]  == false   <= I don't have number 2 in the array
//            MyBooleanArray[3]  == false   <= I don't have number 4 in the array
            if(MyBooleanArray[i] == false){
                return i+1;
            }
        }

        return param1.length +1 ;
    }
}
