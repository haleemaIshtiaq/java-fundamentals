package se.lexicon;
import java.util.Random;
//Exercise-8 Guess the number
public class GuessTheNumber {
    void main(){
        Random random = new Random();
        int randomNumber=random.nextInt(1,501);
        //IO.println(randomNumber);
        boolean isRight = false;
        int counter = 0;
        while(!isRight) {
            int guessNumber = Integer.parseInt(IO.readln("Enter your guess : "));
            counter +=1;
            if(guessNumber==randomNumber){
                IO.println("Correct! You got it in " +counter +" guesses.");
                isRight = true;
            }
            else if (guessNumber > randomNumber){
                IO.println("Too big!");
            }
            else{
                IO.println("Too small!");
            }
        }
        }

    }

