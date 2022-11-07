package Day_21_MethodsAndMethodOverload;


public class MethodExample {
    public static void main(String[] args) {
       int average= calculateAverage(75,80);
       String text=analyseAverage(average);
       display(text);

    }
    public static int  calculateAverage(int exam1, int exam2 ){
        int average = exam1+exam2;
        average=average/2;
        return average ;
    }

    public static String analyseAverage(int average){
        String retVal="";
        if(average<50){
           retVal = ("Your grades are very low you need to study harder ");
        } else if (average>50&&average<75) {
           retVal = ("Your grades not bad but you can study more");
        }else if (average>75){
           retVal = ("Your grades are perfect keep studying");
        }
        return retVal;
    }
    public static void display(String text){
        System.out.println(text);
    }


}
