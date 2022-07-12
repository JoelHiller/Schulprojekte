package test;
import java.io.*;

public class AusgabeAlter {
    public static void main(String[] args) throws IOException {
        int ialter;
        char calter;

        System.out.println("Wie alt sind sie?");
                ialter = System.in.read();
        calter = (char) ialter;

        System.out.println("Sie sind " + calter + " Jahre alt.");
    }

}
