package Euklid;

import java.util.Scanner;

public class Euklid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben sie bitte die erste Zahl an: ");
        int teiler_1 = scanner.nextInt();
        System.out.println("Geben sie bitte die zweite Zahl an: ");
        int teiler_2 = scanner.nextInt();

        euclid(teiler_1, teiler_2, 0);
    }

    public static void euclid(int a, int b, int Rechenanzahl) {
        if(b == 0){
            System.out.println("Der größte gemeinsame Teiler ist " + a + " bei " + Rechenanzahl + " Rechenoperationen");
        }
        else{
            euclid(b, a%b, Rechenanzahl+1);
        }
    }
}

//Struktogram-Programm not working, so no Struktogram this timef