package se.lexicon;

public class FindAllPrimeNumbers {
    static boolean isPrime(int n){

        if(n<=1){
            return false;
        }
        for (int i = 2; i*i <= n ; i++){
            if(n % i== 0){
                return false;
            }
        }
        return true;
    }
    void main(){
        for(int number = 2; number <= 50; number++){
            if(isPrime(number)){
                IO.print(number +" ");

            }
        }

    }
}
