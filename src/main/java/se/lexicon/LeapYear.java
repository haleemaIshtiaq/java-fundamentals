package se.lexicon;

//Exercise2 - Leap Year
public class LeapYear {
    void main() {
        int year = Integer.parseInt(IO.readln("Enter a year: "));
        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            IO.println(year + " is a leap year ");
        }
        else {
                IO.println( year + " is NOT a leap year ");
            }
        }
    }


