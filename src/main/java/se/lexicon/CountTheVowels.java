package se.lexicon;

public class CountTheVowels {
    static int  countVowels(String s){
        s=s.toLowerCase();
        int count=0;

        for (int i = 0; i < s.length(); i++){
            char ch=s.charAt(i);
           // if(ch=='a' || ch=='e'|| ch=='i'|| ch=='o'||ch=='u')
            if("aeiou".indexOf(ch) !=-1){
                count++;
            }
        }
     return count;
    }

    void main(){
        int result = countVowels("Java");
        IO.println("Number of vowels; " +result);
    }
}
