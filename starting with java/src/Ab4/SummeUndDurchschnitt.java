package Ab4;

import java.util.Scanner;

public class SummeUndDurchschnitt {
    public static void main(String[] args) {
        int number;
        int sum = 0;
        int anzahl = 0;
        String teiler = "";
        Scanner scanner = new Scanner(System.in);;
        do{
            System.out.println("Geben sie bitte eine Zahl an: ");
            number = scanner.nextInt();
            if(number != 0){
                anzahl++;
                sum += number;
            }
        }
        while(number != 0);
        System.out.println("Summe: " + sum + " Durchschnitt: " + sum/anzahl);
    }
}
