package se.lexicon;
//Exercise 4- Average of three numbers
public class AverageThreeNumbers {
    void main (){

        int num1 = Integer.parseInt(IO.readln("Enter first number: "));
        int num2 = Integer.parseInt(IO.readln("Enter second number: "));
        int num3 = Integer.parseInt(IO.readln("Enter third number: "));
        double average = (num1 + num2 + num3)/ 3.0;
        IO.println("Average: " + average);
    }
}
