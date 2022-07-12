package Sortieralgorithmen;

public class TimeCalculator {
    public static String calculateTime(long timeA, long timeB){
        long time = timeA - timeB;
        long seconds = time/1000;
        long milliseconds = time%1000;
        long minutes = seconds/60;
        seconds = seconds%60;
        return minutes + " Minuten, " + seconds + " Sekunden, " + milliseconds + " Millisekunden";
    }
}
