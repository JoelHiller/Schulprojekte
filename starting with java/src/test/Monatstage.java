package test;
import java.util.Scanner;

public class Monatstage {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int monat;
        int jahr;
        int tage = 0;
        System.out.println("Geben sie bitte den Monat an (1-12): ");
        monat = scanner.nextInt();
        System.out.println("Geben sie bitte das Jahr an: ");
        jahr = scanner.nextInt();
        switch (monat) {
            case 1 :case 3 :case 5 :case 7 :case 8 :case 10 :case 12: tage = 31; break;
            case 4 :case 6 :case 9 :case 11: tage = 30; break;
            case 2: tage = calculateFebruary(jahr); break;
        }
        System.out.println("Die Anzahl der Tage im Monat " + monat + " im Jahr " + jahr + " beträgt: " + tage);

    }
    public static int calculateFebruary(int jahr) {
        int tage = 0;
        boolean schaltjahr;
        if(jahr%4 == 0){
            if(jahr%100 == 0){
                if(jahr%400 == 0){
                    schaltjahr = true;
                }
                else{
                    schaltjahr = false;
                }
            }
            else{
                schaltjahr = true;
            }
        }
        else{
            schaltjahr = false;
        }
        if (schaltjahr) {
            tage = 29;
        }
        else{
            tage = 28;
        }
        return tage;
    }
}
