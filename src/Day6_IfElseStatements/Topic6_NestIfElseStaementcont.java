package Day6_IfElseStatements;

public class Topic6_NestIfElseStaementcont {

    // Last Names = Doe, Yilmaz, Ekinci
    // if last name is Yilmaz and the age is over 20 print the lastname and the age if not just print the lastname
    // if lastname is Doe and the age is over 10 print just the lastname if not print the just age
    // if it is Ekinci print lastname and age.
    public static void main(String[] args) {
        String lastname="Ekinci";
        int age = 10;

        if(lastname=="Yilmaz"){
            if(age>20){
                System.out.println("The Lastname is: "+lastname+" the age is: "+age);
            }else{
                System.out.println("Just Lastname: "+lastname);
            }
        }else if(lastname == "Doe"){
            if(age>10){
                System.out.println("Just the Lastname: "+lastname);
            }else{
                System.out.println("Just the Age "+age);
            }

        }else{
            System.out.println("Lastname: "+lastname+" Age: "+age);
        }

    }

}
