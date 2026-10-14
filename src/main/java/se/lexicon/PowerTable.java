package se.lexicon;

public class PowerTable {
    void main(){
        int base = Integer.parseInt(IO.readln("Enter base: "));
        for(int i=1;i<=10;i++){
            double power=Math.pow(base,i);
            //IO.println(base +" ^ " +i +"  =   "  +power);
            IO.println(String.format("%d ^ %2d = %9.1f " , base, i, power));

        }
    }
}
