package se.lexicon;

public class RightTriangleChecker {
    void main(){
        double side1 = Double.parseDouble(IO.readln("Enter side a: "));
        double side2 = Double.parseDouble(IO.readln("Enter side b: "));
        double side3 = Double.parseDouble(IO.readln("Enter side c: "));
        double temp = Math.max(side1,side2);
        double longest = Math.max(side3,temp);
        IO.println("Longest side: " +longest);
        if(side1<=0 || side2<=0 || side3<=0){
            IO.println("This is NOT a right triangle");
        }
        else{
            double a =side1*side1;
            double b= side2*side2;
            double c= side3*side3;
            if(a+b==c||a+c==b||b+c==a){
                IO.println("This is a right triangle");
            }
            else{
                IO.println("This is NOT a right triangle");
            }
        }

    }
}
