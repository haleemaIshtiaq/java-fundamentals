package se.lexicon;

import java.util.Locale;

public class StringStats {
    void main(){
        String sentence =  IO.readln("Enter a sentence: ");
        int vowels=0;
        int consonants=0;
        int digits=0;
        int spaces=0;

        sentence= sentence.toLowerCase();
        for (int i = 0; i < sentence.length(); i++){

            char ch=sentence.charAt(i);

            //Check vowels
            // if(ch=='a' || ch=='e'|| ch=='i'|| ch=='o'||ch=='u')
            if("aeiou".indexOf(ch) !=-1){
                vowels++;
            }
            //Check consonants
             else if(ch>='a' && ch<= 'z'){
                consonants++;
            }
             //Check digits
            else if(ch>='0' && ch<= '9'){
                digits++;
            }
            //Check spaces
            else if(ch== ' '){
                spaces++;
            }

        }
        IO.println("Vowels: " +vowels);
        IO.println("Consonants: " +consonants);
        IO.println("Digits: " +digits);
        IO.println("Spaces: " +spaces);

    }
}
