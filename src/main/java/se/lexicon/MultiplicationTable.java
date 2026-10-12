package se.lexicon;
//Exercise - 14 Multiplication table
public class MultiplicationTable {
    void main() {
        int number = Integer.parseInt(IO.readln("Enter a number: "));
        for (int i = 1; i <= 10; i++) {
            int result = number * i;
            IO.println(number + " x " + i + " = " + result);
        }
        IO.print("   ");
        for (int j = 1; j <= 10; j++){
            if((j)>9){
                IO.print("   "  +j);
            }
            else {
                IO.print("    " + j);
            }
        }
         //IO.println("\n");
        IO.println(" \n       -----------------------------------------------");
        for (int k = 1; k <= 10; k++){
            IO.print(k);
            IO.print(" |");
            for (int l = 1; l <= 10; l++){

                if((l*k)>9){
                    IO.print("   "  +(l*k));
                }
                else{
                    IO.print("    "  +(l*k));
                }
            }
            IO.println("\n");
        }
    }
}