package Day17_ArraysCont;

public class Topic2_ArraySwap {

    public static void main(String[] args) {

        String [] names = {"Ziya","Hrakar","Firuze"};

        // swap the "Firuze with "Harakar" and later swap "Ziya" with "Hrakar"

       // names[2]=names[1]; // {"Ziya", "Hrakar", "Hrakar"}
        String dummy = names[2];

        names[2]=names[1];   /// {"Ziya","Hrakar","Hrakar"}
        names[1] = dummy; // {"Ziya","Firuze","Hrakar"}

        dummy = names[0];
        names[0]=names[2]; // {"Hrakar","Firuze","Harakar"}
        names[2] = dummy; // {"Harakar","Firuse","Ziya"}
        System.out.println("{ "+names[0]+", "+names[1]+", "+names[2]+" }");






    }
}
