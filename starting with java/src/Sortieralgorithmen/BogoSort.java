package Sortieralgorithmen;

import java.util.Scanner;

public class BogoSort {
    public static void main(String[] args){
        int length;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben sie bitte die Größe des zu sortierenden Arrays an (maximal 1 000 000 000): ");
        length = scanner.nextInt();
        final long timeStart = System.currentTimeMillis();
        int[] array = new int[length];
        for(int i = 0; i < array.length; i++){
            array[i] = (int) Math.floor(Math.random() * 1000000000);
            System.out.println(array[i]);
        }
        int[] sorted = sort(array);

        System.out.println("This is your Sorted Array:");
        for (int j : sorted) {
            System.out.println(j);
        }
        final long timeEnd = System.currentTimeMillis();
        System.out.println("Sortierdauer: " + TimeCalculator.calculateTime(timeEnd, timeStart) + " bei " + length + " Zahlen");
    }
    public static int[] sort(int[] array) {
        while (!issorted(array)) {
            for (int i = 0; i < array.length; i++) {
                int index1 = (int) (Math.random() * array.length),
                        index2 = (int) (Math.random() * array.length);
                int a = array[index1];
                array[index1] = array[index2];
                array[index2] = a;
            }
        }
        return array;
    }
    public static boolean issorted(int[] array) {
        for(int i = 0; i < array.length-1; i++) {
            if(array[i] > array[i+1]) {
                return false;
            }
        }
        return true;
    }
}
