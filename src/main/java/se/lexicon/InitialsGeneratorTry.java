package se.lexicon;

public class InitialsGeneratorTry {
    void main(){

        String name = IO.readln("Enter your full name: ");
        name= name.toUpperCase();

        int position = name.indexOf(' ');
        int position2= name.lastIndexOf(' ');
        //IO.println(position2);

        String lastName = name.substring(position2 + 1);

            if(position==position2){
                IO.println("Initials: " + name.charAt(0) +"." +lastName.charAt(0) +".");
            }

        else {
                String middleName = name.substring(position+1,position2);
                IO.println("Initials: " + name.charAt(0) +"." +middleName.charAt(0) +"." +lastName.charAt(0) +".");

        }
    }

}

