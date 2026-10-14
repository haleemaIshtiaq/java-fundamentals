package se.lexicon;

import java.time.LocalDate;
import java.time.Period;

public class ProfileCardBuilder {
    void main(){
        String name = IO.readln("Enter name: ");
        String birthdate = IO.readln("Enter birthdate (yyyy-MM-dd): ");
        String city = IO.readln("Enter city: ");
        String email = IO.readln("Enter email: ");
        //Parsing from string
        LocalDate parsedBirthDate = LocalDate.parse(birthdate);
        //Getting today's date
        LocalDate today = LocalDate.now();


        //Calculate age from birthdate
        int age =Period.between(parsedBirthDate,today).getYears();

        IO.println("Your age: " + age +" years");

        StringBuilder card = new StringBuilder();
        card.append("╔══════════════════════════════╗\n");
        card.append("║      Profile Card            ║\n");
        card.append("╠══════════════════════════════╣\n");
        card.append(String.format("║ %-7s: %-19s ║\n", "Name", name));
        card.append(String.format("║ %-7s: %-19s ║\n", "Age", age));
        card.append(String.format("║ %-7s: %-19s ║\n", "City", city));
        card.append(String.format("║ %-7s: %-19s ║\n", "Email", email));
        card.append("╚══════════════════════════════╝");

        IO.println(card);




    }
}
