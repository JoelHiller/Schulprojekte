package Ab4;

import java.util.Scanner;

public class SumB {
    public static void main(String[] args) {
        int sum = 0;
        int border;
        int glieder = 1;
        Scanner scanner = new Scanner(System.in);;
        System.out.println("Geben sie bitte den Grenzwert an: ");
        border = scanner.nextInt();
        while(sum < border){
            if(glieder % 2 == 0){
                sum = sum + glieder;
            }
            else{
                sum = sum - glieder;
                
            }
            glieder++;
        }
        System.out.println("Die Anzahl der GLieder beträgt: " + glieder + " mit dem Endergebnis " + sum);
    }
}
