package se.lexicon;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class AppointmentPlanner {
    void main(){
        String[] names = new String[3];
        LocalDateTime[] dates = new LocalDateTime[3];
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        for(int i=0; i<3; i++){
            names[i] = IO.readln("Enter appointment " + (i+1) +" name: ");
            String input = IO.readln("Enter appointment " + (i+1) +" date-time (yyyy-MM-dd HH:mm):  ");
            dates[i] = LocalDateTime.parse(input,formatter);
        }
        //Sort appointments by date and time
        for(int i=0; i<3; i++){
            for(int j=i+1; j<3; j++){
                if(dates[i].isAfter(dates[j])){
                   //Swap dates
                   LocalDateTime tempDate= dates[i];
                   dates[i]=dates[j];
                   dates[j]=tempDate;

                   //swap names
                    String tempName = names[i];
                    names[i]=names[j];
                    names[j]=tempName;

                }
            }
        }
        DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("eeee, dd MMMM yyyy 'at' HH:mm");
        IO.println("--- Your Schedule ---");
        for(int i=0; i<3; i++){
            IO.println((i+1) +". " +String.format("%-15s",names[i]) +" - " +dates[i].format(outputFormatter));
        }

    }
}
