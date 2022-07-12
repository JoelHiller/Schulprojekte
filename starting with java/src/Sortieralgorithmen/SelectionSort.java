package Sortieralgorithmen;

import java.util.Scanner;

public class SelectionSort {
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
        for (int durchlauf = 0; durchlauf < array.length; durchlauf++) {
            int min = 1;
            int index = 0;
            for (int i = durchlauf; i < array.length; i++) {
                if (min > array[i]) {
                    min = array[i];
                    index = i;
                }
            }
            int temp = array[durchlauf];
            array[durchlauf] = array[index];
            array[index] = temp;
        }
        return array;
    }
}
