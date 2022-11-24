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

    public static String mostPoeticalWord(String poem){

        String[] words = poem.split(" "); // ['and','the','garden',.....]

        int count2 = 0;
        String wordResult="";
        for (int i = 0; i < words.length; i++){

            String word = words[i]; // and

            int count = 0;

            char[] letters = word.toCharArray(); // ['a','n','d']
            for(int j=0; j< letters.length; j++){
                if(letters[j] == 'a' || letters[j] == 'b' || letters[j] == 'c' || letters[j] == 'd' || letters[j] == 'e'|| letters[j] == 'f' ){
                    count=count+1;
                }else if(letters[j] == 'k'){
                    count=count-1;
                }else if(letters[j] == 'x'){
                    count=count-2;
                }
            }
            if(count>count2){
                count2 = count;
                wordResult = words[i];
            }
        }
        return wordResult;
    }

}
