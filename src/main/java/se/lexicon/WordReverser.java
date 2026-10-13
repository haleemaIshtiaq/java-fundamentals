package se.lexicon;

public class WordReverser {
    void main(){
        String word = IO.readln(" Enter a word: ");

        //Created stringBuilder
        StringBuilder sb = new StringBuilder(word);

        //Reversing
        sb.reverse();
        IO.println("Reversed: " + sb);


    }

}
