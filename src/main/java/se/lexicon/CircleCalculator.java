package se.lexicon;

public class CircleCalculator {
    void main(){
        double radius = Double.parseDouble(IO.readln("Enter radius: "));
        double area = Math.PI*radius*radius;
        double circumference = 2*Math.PI*radius;

        IO.println(String.format("%s %.2f " , "Area: ", area));
        IO.println(String.format("%s %.2f " , "Circumference: ", circumference));

    }
}
