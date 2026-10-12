package se.lexicon;

public class SumOfDigits {
    static int sumOfDigits(int n){
        int sum = 0;
        while (n>0){
            int digit = n%10;
            sum = sum+digit;
            n=n/10;
        }
        return sum;
    }
    void main(){
        int result = sumOfDigits(345);
        IO.println("sum of digits: " +result);
    }
}
