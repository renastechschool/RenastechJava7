package Day19_MultiDimensionArrays;

public class Topic9_ForeachCon {

    public static void main(String[] args) {

        String name = "Hrakar Ali Amer";

        char [] chArray= name.toCharArray();
        int count = 0;

        for (char ch:chArray){
            if(ch == 'a' || ch == 'A'){
                count++;
            }
        }
        System.out.println("The count od a's in the "+name+" string is: "+count);


    }
}
