package se.lexicon;

public class UnitConverter {
    void main() {
        IO.println("Choose conversion:");
        IO.println("1. km → miles");
        IO.println("2. kg → lbs");
        IO.println("3. °C → °F / K");

        int choice= Integer.parseInt(IO.readln("Enter choice: "));
        switch(choice){
            case 1->{
                double kilometers = Double.parseDouble(IO.readln("Enter value in km: "));
                double result = convert(kilometers);
                IO.println(kilometers +" km " +"= " +String.format("%.2f",result) + " miles");
            }

        case 2-> {
            double kilograms = Double.parseDouble(IO.readln("Enter value in kg: "));
            double result = convert(kilograms,"lbs");
            IO.println(kilograms +" kg " +"= " +String.format("%.2f",result) + " lbs");
        }
        case 3->{
                double celsius = Double.parseDouble(IO.readln("Enter value in Celsius: "));
                boolean toFahrenheit = Boolean.parseBoolean(IO.readln("Enter true to convert to Fahrenheit or false to kelvin?(true/false): "));
        double result=convert(celsius,toFahrenheit);
                if(toFahrenheit) {
                    IO.println(celsius +" °C " +"= " +String.format("%.2f",result) + " °F");
                }
                else{
                    IO.println(celsius +" °C " +"= " +String.format("%.2f",result) + " K");
                }
            }
        default -> IO.println("Invalid choice!");
    }




    }
    //Convert kilometers to miles
    public static double convert(double km) {
        double mile = km * 0.621371;
        return mile;

    }
    //Convert kilograms to pounds
    public static double convert(double kg, String unit) {
        return kg*2.20462;

    }
    //Convert Celsius to Fahrenheit
    public static double convert(double celsius, boolean toFahrenheit){
       if(toFahrenheit) {
           return (celsius * 9/5) +32;

       }
       else{
           return celsius + 273.15;
       }
    }
}