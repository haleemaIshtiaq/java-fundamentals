package se.lexicon;

public class ReverseNumber {
   void  main() {
        int number = Integer.parseInt(IO.readln("Enter a number: "));
        int reversed=0;
        while(number>0){
        int digit = number % 10;
        reversed = reversed * 10 + digit;
        number = number / 10;
        }
        IO.println("Reversed number: " +reversed);
   }


}
