package se.lexicon;

public class InitialsGenerator {
    void main(){

        String name = IO.readln("Enter your full name: ");
        name= name.toUpperCase();
        int spaces=0;

        for (int i = 0; i < name.length(); i++){
            char ch=name.charAt(i);
              if(ch== ' '){
                spaces++;
            }

        }
        int position = name.indexOf(' ');
        String middleName = name.substring(position+1);
        int position2= name.indexOf(' ',position+1);
        if(spaces>1) {
            String lastName = name.substring(position2 + 1);

            IO.println("Initials: " + name.charAt(0) +"." +middleName.charAt(0) +"." +lastName.charAt(0) +".");
            //IO.println("Initials: " + middleName.charAt(0));
            //IO.println("Initials: " + lastName.charAt(0));

        }
        else{
            IO.println("Initials: " + name.charAt(0) +"." +middleName.charAt(0) +".");
            //IO.println("Initials: " + name.charAt(0));
            //IO.println("Initials: " + middleName.charAt(0));
        }
    }

}
