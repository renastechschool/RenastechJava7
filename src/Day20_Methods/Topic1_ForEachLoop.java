package Day20_Methods;

public class Topic1_ForEachLoop {

    public static void main(String[] args) {

        // Write a code where user is given an arrya of Strings that contains given animal's names
        // find which one of those animals has 'O' in the name

        String [] Animals = {"Cat","Dog","Monkey","Rabbit"};

        for(String animal:Animals){ // animal = "Cat" // first iteration
                                    // animal = "Dog" - second iteration
                                    // animal = "Monkey" - third iteration
                                    // animal = "Rabbit" - fourth iteration
            System.out.println("The current animal variable value: "+animal);
            if(animal.contains("O") || animal.contains("o")){

                System.out.println("The animal "+animal+" has O or o in the name");
            }
            System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");

        }





    }
}
