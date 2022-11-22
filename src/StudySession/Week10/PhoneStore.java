package StudySession.Week10;

public class PhoneStore {
    public static void main(String[] args) {
        CellPhone cellPhone1 = new CellPhone("Iphone","6S");
        CellPhone cellPhone2 = new CellPhone("Iphone","6S",512);

        System.out.println("*********");
        cellPhone1.printProducer();
        System.out.println("*********");
        cellPhone2.printProducer();

        cellPhone2.changeProducer("ASD");
        System.out.println("*********");
        System.out.println("*********");
        cellPhone1.printProducer();
        CellPhone.changeProducer("Nawras");
        System.out.println("*********");
        System.out.println("*********");
        cellPhone1.printProducer();

    }

}
