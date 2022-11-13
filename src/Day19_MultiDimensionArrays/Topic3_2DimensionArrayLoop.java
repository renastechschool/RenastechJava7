package Day19_MultiDimensionArrays;

public class Topic3_2DimensionArrayLoop {

    public static void main(String[] args) {
        String [][] names = {  {"Ziya","Seda"},        {"Sena","anil","Hrakar"},       {"Ferah","Onder","Fahrettin","Amer"}};

        for (int i = 0; i < names.length; i++) {

            System.out.println("The row "+i+":");

            for (int j = 0; j < names[i].length; j++) {

                System.out.print(names[i][j]+" ");
            }
            System.out.println();


        }
    }
}
