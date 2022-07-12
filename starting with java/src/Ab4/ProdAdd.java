package Ab4;

import java.util.Scanner;

public class ProdAdd {
    public static void main(String[] args) {
        int number;
        int mult;
        int prod = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben sie bitte die erste Zahl an: ");
        number = scanner.nextInt();
        System.out.println("Geben sie bitte die zweite Zahl an: ");
        mult = scanner.nextInt();
        if(number < 0){
            for(int i = 0; i > number; i--){
                prod -= mult;
            }
        }
        else if(mult < 0){
            for(int i = 0; i > mult; i--){
                prod -= number;
            }
        }
        else{
            for(int i = 0; i < mult; i++){
                prod += number;
            }
        }
        System.out.println("Das Produkt ist " + prod);
    }
}
