package se.lexicon;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateRangePrinter {
    void main(){
        String startDate = IO.readln("Enter start date (yyyy-MM-dd): ");
        String endDate = IO.readln("Enter end date (yyyy-MM-dd): ");

        LocalDate parsedStartDate = LocalDate.parse(startDate);
        LocalDate parsedEndDate = LocalDate.parse(endDate);

        //Format the output
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy (EEEE)");

        //Check start date is valid(before end date)

       if(parsedStartDate.isAfter(parsedEndDate)){
           IO.println("Invalid : Start date is after the end date");
       }
       else {
           while (!parsedStartDate.isAfter(parsedEndDate)) {
               IO.println(parsedStartDate.format(formatter));

               //Move to next day
               parsedStartDate = parsedStartDate.plusDays(1);
           }
       }
    }
}
