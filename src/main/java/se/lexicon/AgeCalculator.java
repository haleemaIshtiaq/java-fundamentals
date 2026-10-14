package se.lexicon;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class AgeCalculator {
    void main(){
        int year = Integer.parseInt(IO.readln("Enter birth year: "));
        int month = Integer.parseInt(IO.readln("Enter birth month: "));
        int day = Integer.parseInt(IO.readln("Enter birth day: "));


        //Creating a date from these values
        LocalDate specificDate = LocalDate.of(year, month, day);
        //Getting today's date
        LocalDate today = LocalDate.now();


        //Calculate the age
        int age = Period.between(specificDate,today).getYears();
        IO.println("Your age: " + age +" years");

        //Find the next birthday
        LocalDate nextBirthday = specificDate.withYear(today.getYear());

        if(nextBirthday.isBefore(today)){
            nextBirthday = nextBirthday.plusYears(1);
        }
       long daysLeft =ChronoUnit.DAYS.between(today,nextBirthday);
        IO.println("Days until birthday: " + daysLeft);

    }
}
