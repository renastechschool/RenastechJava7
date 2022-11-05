package Day20_Methods;

public class Topic2_ForEachLoopCont {

    public static void main(String[] args) {
        // write a code where you are give an array of String as shown below to check how many character 'c','C'
        // is in the each value;

        String [] animals = {"Cow", "Fish", "Horse","Lion","Crocodile","Eagle"};

        for(String var:animals){
            System.out.println("The value of var variable: "+var);
            int count = 0;
            char [] letters = var.toCharArray(); // {'C','o','w'}
                                                    // {'F','i','s','h'}
            for(char letter:letters){ // letter = 'C' , = 'o' , = 'w'.
                if(letter=='c' || letter == 'C'){
                    count++;
                }
            }
            System.out.println("The animal: "+var+" has "+count+" char c in the name");
            System.out.println("+++++++++++++++++++++++++++++++++++");
        }


    }
}
