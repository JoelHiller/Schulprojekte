package test;
import java.io.*;

public class EingabeReader {
    public static void main(String[] args) throws IOException{
        String str;
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Geben sie einen Text ein!");
        str = input.readLine();
        System.out.println("Sie haben folgendes geschrieben:" + str);
    }
}
