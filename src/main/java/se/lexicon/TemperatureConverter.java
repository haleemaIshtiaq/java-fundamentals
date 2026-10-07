package se.lexicon;
//Exercise 9-Temperature converter
public class TemperatureConverter {
    void main(){
        double c = Double.parseDouble(IO.readln("Enter temperature in celcius: "));
        //int c = Integer.parseInt(IO.readln("Enter temperature in celcius: "));
        double f = c * 9.0/5+32;
        double k = c + 273.15;

        IO.println("Celsius:    " +c +"°C");
        IO.println("Fahrenheit:    " +f +"°F");
        IO.println("Kelvin:    " +k +"k");
    }
}
