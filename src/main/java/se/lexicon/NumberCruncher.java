package se.lexicon;

public class NumberCruncher {
    void main(){
        int num1 = Integer.parseInt(IO.readln("Enter first number: "));
        int num2 = Integer.parseInt(IO.readln("Enter second number: "));
        int num3 = Integer.parseInt(IO.readln("Enter third number: "));
        IO.println("Maximum: " +findMax(num1,num2,num3));
        IO.println("Minimum: " +findMin(num1,num2,num3));
        IO.println(String.format("Average: %.2f", average(num1,num2,num3)));


    }
    public static int findMax(int a, int b, int c){
        return Math.max(a,(Math.max(b,c)));
    }

    public static int findMin(int a, int b, int c){
        return Math.min(a,(Math.min(b,c)));
    }
    public static double average(int a, int b, int c){
        return (a+(double)b+c)/3;
    }
}
