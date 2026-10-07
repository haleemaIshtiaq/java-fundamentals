package se.lexicon;
//Exercise-10 Swap two values without a temp variable
public class SwapTwoValues {
    void main(){
        int a = 15;
        int b = 42;
        IO.println("Before: a = " +a  +", b = " +b);
        a = a+b;
        b = a-b;
        a = a-b;
        IO.println("After: a = " +a  +", b = " +b);


    }
}
