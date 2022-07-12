package test;
import java.util.Scanner;

public class triangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a;
        int b;
        int c;

        System.out.println("Bitte geben Sie die Länge von der Seite A ein: ");
        a = input.nextInt();
        System.out.println("Bitte geben Sie die Länge von der Seite B ein: ");
        b = input.nextInt();
        System.out.println("Bitte geben Siedie Länge von der Seite C ein: ");
        c = input.nextInt();

        if ((a + b > c) && (a + c > b) && (b + c > a)){
            System.out.println("Das Dreieck ist konstruierbar.");
        }
    }
}
