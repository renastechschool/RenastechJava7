package Day22_WrapperClass;

public class class3_Parsing {
    //	methods:
//            parse methods: converts string of text to the primitives, returns primitive values
//            "123"
//
//            valueOf methods: converting string to wrapper class value, returns wrapper class values

    public static void main(String[] args) {


        String str="1905";

        System.out.println(str+55);//text + number = text 190555 text

        int number = Integer.parseInt(str);// 1905 number
        System.out.println(number + 55 ); //1960

        String str2="5.55";
        float f1=Float.parseFloat(str2);
        double d1=Double.parseDouble(str2);

        System.out.println(f1+2.5);
        System.out.println(d1+2.5);

        String str3="true";
        String str4="false";
        String str5="TruE";
        String str6="FalSE";
        boolean bool1=Boolean.parseBoolean(str3);//true
        boolean bool2=Boolean.parseBoolean(str4);//false
        boolean bool3=Boolean.parseBoolean(str5);//case wont matter here as long as it is true or false // true
        boolean bool4=Boolean.parseBoolean(str6);//false

        System.out.println(bool1);
        System.out.println(bool2);
        System.out.println(bool3);
        System.out.println(bool4);


        String str10="Hello123";//error

        /*int myint=Integer.parseInt(str10);
        System.out.println("myint = " + myint);
        error
        */
    }
}
