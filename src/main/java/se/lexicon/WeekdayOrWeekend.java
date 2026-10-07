package se.lexicon;
//Exercise 13- Weekday or weekend
public class WeekdayOrWeekend {
    void main() {
        String day = IO.readln("Enter day: ");

        day= day.toLowerCase();
        switch (day) {
            case "monday", "tuesday", "wednesday", "thursday", "friday" -> IO.println("Weekday.");
            case "saturday", "sunday" -> IO.println("Weekend!");
            default -> IO.println("Unknown day.");
        }
    }

}
