package Ab4;

import java.util.Scanner;

public class Ungerade {
    public static void main(String[] args) {
        int untereGrenze;
        int obereGrenze;
        String ungerade = "";
        Scanner scanner = new Scanner(System.in);;
        System.out.println("Geben sie bitte die untere Grenze an: ");
        untereGrenze = scanner.nextInt();
        System.out.println("Geben sie bitte die obere Grenze an: ");
        obereGrenze = scanner.nextInt();

        for (int i = untereGrenze+1; i < obereGrenze; i++){
            if(i % 2 != 0){
                ungerade += Integer.toString(i) + " ";
            }
        }
        System.out.println("Ungerade Zahlen die zwischen " + untereGrenze + " und " + obereGrenze + " liegen:");
        System.out.println(ungerade);
    }
}
