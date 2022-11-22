package StudySession.Week10;

public class CellPhone {

    String make;
    String model;
    boolean isOpen = false;
    int memory = 256;
    public static String producer = "Renastech";

    public static void main(String[] args) {
        CellPhone cellPhone1 = new CellPhone("Iphone","6S");
        CellPhone cellPhone2 = new CellPhone("Iphone","6S",512);
    }

    public static void changeProducer(String newProducer)
    {
        producer = newProducer;
        System.out.println(producer);
    }

    public static void printProducer()
    {
        System.out.println(producer);
    }


    public CellPhone(String Make, String model)
    {
        this.make = make;
        this.model = model;

    }

    public CellPhone(String make, String model, int memory)
    {
        this.make = make;
        this.model = model;
        this.memory = memory;
    }

    public void openPhone()
    {
        if(isOpen == true)
        {
            System.out.println("The phone is already opened");
        }
        else {
            isOpen = true;
            System.out.println("The phone is opened");
        }
    }

    public void closePhone() {
        if (isOpen == false) {
            System.out.println("The phone is already closed");
        } else {
            isOpen = false;
            System.out.println("The phone is closed");
        }

    }
}
