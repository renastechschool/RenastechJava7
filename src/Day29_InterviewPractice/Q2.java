package Day29_InterviewPractice;

public class Q2 {

    //  Write a method where it takes a poem and returns the most Poetical Word from the poem

    // calculate score of each world by fallowing scores
    // a,b,c,d,e,f +1
    // x -2
    // k -1

    // Example: Poem =>  "and the garden diminishes: grape leaves rumpled and rusty, zucchini felled by borers, tomatoes sparse on the vines"
    // Return => felled

    // question, is there only one space, limitation,

    public static void main(String[] args) {
        System.out.println(mostPoeticalWord("and the garden diminishes: grape leaves rumpled and rusty, zucchini felled by borers, tomatoes sparse on the vines"));
    }

    public static String mostPoeticalWord(String poem){

        String[] words = poem.split(" "); // ['and','the','garden',.....]

        int count2 = 0;
        String wordResult="";
        for (int i = 0; i < words.length; i++){

            String word = words[i]; // and
            System.out.println(word);

            int count = 0;

            char[] letters = word.toCharArray(); // ['a','n','d'] // ['g','a','r','d','e','n']  // ['f','e','l','l','e','d']
            for(int j=0; j< letters.length; j++){
                System.out.println(letters[j]);
                if(letters[j] == 'a' || letters[j] == 'b' || letters[j] == 'c' || letters[j] == 'd' || letters[j] == 'e'|| letters[j] == 'f' ){
                    count=count+1;
                }if(letters[j] == 'k'){
                    count=count-1;
                }if(letters[j] == 'x'){
                    count=count-2;
                }
            } // 3 > 1
              // 4>3
            System.out.println(count);
            if(count>count2){ // count2 = 0, count = 1
                count2 = count; // count2 = 4
                wordResult = words[i]; //wordResult = felled
            }
        }
        return wordResult;
    }

}
