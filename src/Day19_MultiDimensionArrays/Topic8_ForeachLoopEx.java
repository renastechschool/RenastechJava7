package Day19_MultiDimensionArrays;

public class Topic8_ForeachLoopEx {

    public static void main(String[] args) {
        // write a code where user check every string values in array and see if that string has "a" in it:

        String [] str= {"Alibaba","Omur","Gorkem","Nasretting","Hoca"};

        for(String var:str){

            if(var.contains("a")|| var.contains("A")){
                System.out.println("The word: "+var+" contains a or A");
            }else{
                System.out.println("The word: "+var+" does NOT contain a or A");
            }
        }
    }
}
