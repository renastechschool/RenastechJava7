package StudySession.Week9;

import java.util.ArrayList;

public class Week9_2 {
    public static void main(String[] args) {
        ArrayList<Integer> arrList = new ArrayList<>();
        // arrList.add()

        // arrList.get()

        //arrList.set();

        //arrList.size()
        arrList.add(1);
        arrList.add(2);
        arrList.add(3);

        System.out.println(arrList);
        System.out.println("*********");
        for(int i=0; i< arrList.size();i++)
        {
            System.out.println(arrList.get(i));
        }


        arrList.set(0,0);
        System.out.println("*********");
        System.out.println(arrList);


        //Class - Object
        Phone phone1 = new Phone();

        System.out.println(phone1.Make);
        System.out.println(phone1.Model);
        phone1.setAttribute("Iphone", "6s");
        System.out.println("*********");
        System.out.println(phone1.Make);
        System.out.println(phone1.Model);
        System.out.println("*********");
        Phone phone2 = new Phone();

        phone2.setAttribute("Samsung", "S20");
        System.out.println(phone2.Make);
        System.out.println(phone2.Model);

        System.out.println("phone2.Producer = " + phone2.Producer);
        //phone2.changeProducer("RenasTech");
        Phone.changeProducer("RenasTech");
        System.out.println("phone2.Producer = " + phone2.Producer);

        System.out.println("phone1.Producer = " + phone1.Producer);

        Integer.parseInt("3");



    }

}


class Phone
{
    String Make;
    String Model;
    public static String Producer = "Taylan";
    int batteryCapacity;

    public void setAttribute(String make, String model)
    {
        Make = make;
        Model = model;

        System.out.println("Make: " +Make + "Model: " + Model);

    }

    public static void changeProducer(String newProducer)
    {
        Producer = newProducer;
    }


}
