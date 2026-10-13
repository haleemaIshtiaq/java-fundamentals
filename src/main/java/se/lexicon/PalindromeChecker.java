package se.lexicon;

public class PalindromeChecker {
    void main(){
        String word = IO.readln("Enter the word: ");
        StringBuilder sb = new StringBuilder(word);
        sb.reverse();
        String reversed = sb.toString();
        //IO.println(reversed);
        if(word.equalsIgnoreCase(reversed)){
           IO.println(word + " is a palindrome.");
        }
        else{
            IO.println(word + " is not a palindrome.");
        }
    }
}
