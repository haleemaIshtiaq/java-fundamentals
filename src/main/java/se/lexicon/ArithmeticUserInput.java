package se.lexicon;

public class ArithmeticUserInput {
    //Arithmetic with user input
    void main(){
        int num1 = Integer.parseInt(IO.readln("Enter first number: "));
        int num2 = Integer.parseInt(IO.readln("Enter second number: "));


        IO.println(num1 +" + " +num2 +" = " +(num1+num2));
        IO.println(num1 +" - " +num2 +" = " +(num1-num2));
        IO.println(num1 +" * " +num2 +" = " +(num1*num2));
        IO.println(num1 +" / " +num2 +" = " +(num1/num2));
        IO.println(num1 +" / " +num2 +" = " +((double)num1/num2));//To get decimal result



    }
}
