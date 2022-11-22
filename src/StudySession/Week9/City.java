package StudySession.Week9;

public class City {

    public String name;
    public long population;
    public String aliasName;

    public static String cityOfState = "State of New York";
    public static String CapitalOftheState = "Albany";

    public void display(){
        System.out.println("Citys name is : " + name);
        System.out.println("Citys population is : " + population);
        System.out.println("This Citys alias is : " + aliasName);
    }

    public void nyCommons(){
        System.out.println("Capital of Ny State : " + CapitalOftheState);
    }

    static int add(int a, int b){
        return a + b;
    }

}
