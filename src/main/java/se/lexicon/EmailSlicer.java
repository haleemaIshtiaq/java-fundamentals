package se.lexicon;

public class EmailSlicer {
    void main(){
        String email = IO.readln("Enter email: ");
        //Find the position of @
        int position = email.indexOf("@");

        //Extract username
        String userName = email.substring(0, position);
        //Extract domain
        String domain = email.substring(position+1);

        IO.println("Username: " +userName);
        IO.println("Domain: " +domain);


    }
}
