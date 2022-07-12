package Ab4;

import java.util.Scanner;

public class Teiler {
    public static void main (String[] args) {
        int number;
        String teiler = "";
        Scanner scanner = new Scanner(System.in);;
        System.out.println("Geben sie bitte eine ganze Zahl an: ");
        number = scanner.nextInt();
        for(int i = 1; i <= number; i++) {
            if(number % i == 0){
                teiler = teiler + Integer.toString(i) + " ";
            }
        }
        System.out.println(number + " ist durch " + teiler + " teilbar");
    }
}
