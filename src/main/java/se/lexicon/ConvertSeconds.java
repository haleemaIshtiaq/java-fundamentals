package se.lexicon;
// Exercise-7 Convert seconds
public class ConvertSeconds {
    void main(){
        int totalSeconds = Integer.parseInt(IO.readln("Enter seconds: "));

        int hours = totalSeconds/3600;
        int remainingSeconds = totalSeconds%3600;
        int mins = remainingSeconds/60;
        int secs = remainingSeconds%60;
        IO.println(hours +":" +mins +":" +secs);
    }
}
