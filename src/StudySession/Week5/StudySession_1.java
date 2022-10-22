public class StudySession_1 {
    public static void main(String[] args) {
        String string1 = "Hello";
        String string2 = "Hello";
        String string3 = new String("Hello");

        System.out.println(string1 == string2);
        System.out.println(string3 == string1);
        System.out.println("*********");
        int first1 = 1;
        byte first2 =1;
        float first3 = 1.0f;
        System.out.println(first1 == first2);
        System.out.println(first1 == first3);
        System.out.println("*********");


        //Equals
        System.out.println(string3.equals(string1));
        //EqualsIgnoreCase
        String string11 = "Hello";
        String string22 = "HELLO";
        System.out.println(string11.equalsIgnoreCase(string22));

        //CharAt
        char firstLetter = string11.charAt(0);
        System.out.println("firstLetter = " + firstLetter);



        //length
        int length = string11.length();
        System.out.println("length = " + length);
        System.out.println(string11.charAt(length-2));

        //Contains
        String message= "Hello World";
        System.out.println(message.contains("he"));
        System.out.println("********");
        System.out.println(message.contains(message));
        System.out.println("********");
        System.out.println(message.contains("He W"));
        System.out.println(message.contains("He") && message.contains("W"));

        //SubString

        String message2= "unHappy";

        System.out.println(message2.substring(2));
        System.out.println(message2.substring(2,6));
        //isEmpty

        String myString5 = null;
        String myString6 = " ";
        System.out.println(myString6.isEmpty());


        System.out.println(myString6.isEmpty());

        //lowercase - uppercase

        String myText = "Hello .!2 WorLd";

        System.out.println(myText.toLowerCase());
        System.out.println(myText.toUpperCase());

        //IndexOf
        String myStr = "Hello planet earth, you are a great planet.";
        System.out.println(myStr.indexOf("planet"));
        System.out.println(myStr.indexOf("planet",7));

        //LastIndexOf
        System.out.println(myStr.lastIndexOf("planet",6));


        //replace

        String myStr2 = "Hello";

        System.out.println(myStr2.replace("l","p"));
        System.out.println(myStr2.replaceFirst("l","p"));
        //heplo
        //heppo

        //endswith

        String email = "renas@tech.com";

        System.out.println(email.endsWith(".com") || email.endsWith(".ca") || email.endsWith(".uk"));

        //starthwith
        System.out.println(email.startsWith("renas?"));

    }
}
