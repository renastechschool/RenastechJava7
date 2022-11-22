package StudySession.Week9;

public class MyCity {
    public static void main(String[] args) {

        //City New_york, Broolyn;
        //New_york = new City();
        //Broolyn = new City();

        City New_York = new City();
        City Brooklyn = new City();

        New_York.name = "New York";
        New_York.population = 8000_000;
        New_York.aliasName = "Gotham";

        System.out.println("Details of New York");
        New_York.display();
        New_York.nyCommons();

        System.out.println("=====================");

        Brooklyn.name = "Brooklyn";
        Brooklyn.population = 200_000;
        Brooklyn.aliasName = "Breuckelen";

        System.out.println("Details of Brooklyn");
        Brooklyn.display();
        Brooklyn.nyCommons();




    }
}
