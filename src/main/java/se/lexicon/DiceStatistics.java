package se.lexicon;

import java.util.Arrays;

public class DiceStatistics {
    void main(){
        int rolls = Integer.parseInt(IO.readln("How many rolls? "));
        int doubles=0;


        for (int i=1; i<=rolls;i++){
            //  Random number from 1 and 6
             int dice1 = (int) (Math.random() * 6) + 1;
             int dice2 = (int)(Math.random() * 6) + 1;

             int sum=dice1+dice2;
             if(dice1==dice2){
                 IO.println("Roll " +i +": " +dice1 +" + " +dice2  +" = " +sum + "  DOUBLE");
                  doubles++;
             }
             else{
                 IO.println("Roll " +i +": " +dice1 +" + " +dice2  +" = " +sum);
             }

        }

        IO.println("Doubles rolled: " +doubles +" out of " +rolls);
    }
}
