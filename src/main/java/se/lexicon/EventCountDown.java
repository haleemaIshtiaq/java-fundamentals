package se.lexicon;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class EventCountDown {
    void main(){
        String eventName = IO.readln("Enter event name: ");
        String date = IO.readln("Enter event date (yyyy-MM-dd): ");
        //Parsing from string
        LocalDate eventDate = LocalDate.parse(date);

        //Getting today's date
        LocalDate today = LocalDate.now();

        //Calculate number of days between today and event
        long days = ChronoUnit.DAYS.between(today,eventDate);

         //Day negative means the event has already passed
        if(days<0){
            IO.println(eventName +" was " + -days +" days ago.");
        }

        //Day positive means the event is in future
        else if(days>0){
            IO.println(eventName +" is in " +days +" days.");
        }

        //Day zero means event is today
        else{
            IO.println(eventName +" is today.");
        }



    }
}
