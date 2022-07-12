package Ab4;

import java.util.Scanner;

public class SumA {
    public static void main(String[] args) {
        int sum = 0;
        int border;
        int glieder = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben sie bitte den Grenzwert an: ");
        border = scanner.nextInt();
        do{
            sum = sum + (sum+1);
            glieder++;

        }while(sum < border);
    }
}
