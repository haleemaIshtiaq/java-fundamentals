package se.lexicon;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TodayCalendar {
    void main(){
        LocalDate today = LocalDate.now();
       // IO.println("Today: " + today);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("eeee, dd MMMM yyyy ");
        String formattedTime = today.format(formatter);
        IO.println("Today is: " + formattedTime);

        if(today.getDayOfWeek().getValue()>6){
            IO.println("It is a Weekend.");
        }
        else{
            IO.println("It is a Weekday.");
        }




    }
}

