package se.lexicon;
//Greet the user
public class GreetUser {
    void main(){
        String firstName = IO.readln("Enter first name: ");
        String lastName = IO.readln("Enter last name: ");

        firstName = firstName.substring(0,1).toUpperCase() + firstName.substring(1);
        lastName = lastName.substring(0,1).toUpperCase() + lastName.substring(1);
        IO.println("Hello, " +firstName +" " +lastName +"! Welcome aboard.");
    }
}
