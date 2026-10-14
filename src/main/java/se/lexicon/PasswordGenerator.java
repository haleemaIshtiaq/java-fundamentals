package se.lexicon;

public class PasswordGenerator {
    void main(){
        int passwordLength =Integer.parseInt(IO.readln("Enter password length: "));
        //Characters allowed in password
        String password = "abcdefghijklmnopgrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        //IO.println(password.length());
        StringBuilder userPassword = new StringBuilder();

        for(int i =1 ; i<=passwordLength; i++){
            //Generate a random index from 0 to 61
            int random= (int) (Math.random()*password.length());

            //Get the character at random index and add it to password
            userPassword.append(password.charAt(random));

        }
        IO.println("Generated password: " +userPassword);

    }
}
