package se.lexicon;
//Exercise 12 - Grade Calculator
public class GradeCalculator {
    void main(){
        int num = Integer.parseInt(IO.readln("Enter score: "));
        if(num<0 || num>100){
            IO.println("Error: Invalid input");
        }
        else{
            if(num>=90){
                IO.println("Grade A");
            }
            else if(num>=80){
                IO.println("Grade B");
            }
            else if(num>=70){
                IO.println("Grade C");
            }
            else if(num>=60){
                IO.println("Grade D");
            }
            else {
                IO.println("Grade F");
            }

        }
    }

}
