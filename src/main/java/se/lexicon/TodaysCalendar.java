package se.lexicon;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TodaysCalendar {
    void main(){
        LocalDate today = LocalDate.now();
       // IO.println("Today: " + today);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("eeee, dd MMMM yyyy ");
        String formattedTime = today.format(formatter);

        DateTimeFormatter f = DateTimeFormatter.ofPattern("eeee");
        String formattedDay = today.format(f);

        IO.println("Today is: " + formattedTime);
        //IO.println("Today is: " + formattedDay);

        switch (formattedDay) {
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> IO.println("It's a weekday.");
            case "Saturday", "Sunday" -> IO.println("It's the weekend!");

                default -> IO.println("Invalid day.");

        }

    }
}
