package Ab4;

import java.util.Scanner;

public class Ausgabe {
    public static void main(String[] args) {
        int number;
        String sternchen = "";
        String zwischen = "";
        String finalrows = "";
        Scanner scanner = new Scanner(System.in);;
        System.out.println("Geben sie bitte die Kantenlänge an: ");
        number = scanner.nextInt();
        for (int i = 0; i< number; i++){
            sternchen += "* ";
        }
        if(number > 2){
            zwischen += "* ";
            for(int i = 1; i< number-1; i++){
                zwischen += "  ";
            }
            zwischen += "* ";
        }

        finalrows = sternchen + "\n";
        for(int i = 1; i< number-1; i++){
            finalrows += zwischen + "\n";
        }
        finalrows += sternchen ;

        System.out.println(finalrows);
    }
}
