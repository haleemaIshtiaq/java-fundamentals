package se.lexicon;

public class RunningTotal {
    void main() {
        int number ;
        int count=0;
        int total=0;
        double average=0;

    while(true)

    {
        number = Integer.parseInt(IO.readln("Enter a number (0 to stop): "));
        if(number==0){
            break;
        }
        count=count+1;
        total=total+number;
        IO.println("Total: " + total + " | " + "Count: " + count);

    }
    if(count>0) {
        average =   total / count;
    }
    IO.println("--- Summary ---");
    IO.println("Count:   "  +count);
    IO.println("Total:   "   +total);
    IO.println("Average: "  +average);

    }
}
