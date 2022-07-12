package test;
import java.util.Scanner;

public class KinderGeld {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quantityChilds;
        double yearlyIncome;
        System.out.println("Please Type in the amount of Childrens you have: ");
        quantityChilds = scanner.nextInt();
        System.out.println("Please Type in your Yearly Income in €: ");
        yearlyIncome = scanner.nextDouble();
        System.out.println("Your amount of 'Kindergeld' is: " + calculateIncome(yearlyIncome, quantityChilds) + " €");
    }
    private static double[] lowIncome = new double[]{70, 130, 220, 240};
    private static double[] highIncome = new double[]{70, 70, 140, 140};
    private static double calculateIncome(double yearlyIncome, int quantityChild) {
        double[] benefitsPerChild = yearlyIncome < 45_000 ? lowIncome : highIncome;
        double benefits = 0;
        for (int i = 0; i < quantityChild; i++) {
            double benefit = i < benefitsPerChild.length
                    ? benefitsPerChild[i]
                    : benefitsPerChild[benefitsPerChild.length - 1];

            benefits += benefit;
        }

        return benefits;
    }
}