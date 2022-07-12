package test;
import java.util.Scanner;

public class borderWorth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int borderWorthTop;
        int borderWorthBottom;
        int worth;

        System.out.println("Bitte geben Sie die obere Grenze ein: ");
        borderWorthTop = input.nextInt();
        System.out.println("Bitte geben Sie die untere Grenze ein: ");
        borderWorthBottom = input.nextInt();
        System.out.println("Bitte geben Sie einen Wert ein: ");
        worth = input.nextInt();

       if ((worth > borderWorthBottom) && (worth < borderWorthTop)){
           System.out.println("Grenzbereich erreicht");
       }
    }
}

