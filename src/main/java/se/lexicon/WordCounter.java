package se.lexicon;

public class WordCounter {
    void main(){
        String sentence = IO.readln("Enter a sentence: ");
        //int countWords = sentence.split("\\s").length;
        int counter=0;
        String searchedWord = IO.readln("Enter word to find: ");
        String[] words = sentence.trim().split("\\s+");
        int countWords = words.length;

        for (String str : words) {
               // IO.println(str);
                if(str.equalsIgnoreCase(searchedWord)){
                    counter++;
                }
            }
        if(counter==0){
            IO.println("Word not found");
            IO.println("Total words:" +countWords);
        }
        else {
            IO.println("Total words:" + countWords);
            IO.println(searchedWord + " appears: " + counter + " times");
        }

    }
}
