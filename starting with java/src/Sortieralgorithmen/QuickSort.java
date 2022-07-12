package Sortieralgorithmen;

import java.util.Scanner;

public class QuickSort {
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
        int[] sorted = sort(array, 0, array.length - 1);

        System.out.println("This is your Sorted Array:");
        for (int j : sorted) {
            System.out.println(j);
        }
        final long timeEnd = System.currentTimeMillis();
        System.out.println("Sortierdauer: " + TimeCalculator.calculateTime(timeEnd, timeStart) + " bei " + length + " Zahlen");
    }

    public static int[] sort(int[] array, int s, int e) {
        if (e > s) {
            int i = s;
            int j = e - 1;
            int pivotElement = array[e];
            int tmp;
            while (array[i] < pivotElement) {
                i++;
            }
            while (array[j] > pivotElement && j > 0) {
                j--;
            }
            if (i < j) {
                tmp = array[i];
                array[i] = array[j];
                array[j] = tmp;
            }
            while (i < j) {
                while (array[i] < pivotElement) {
                    i++;
                }
                while (j > 0 && array[j] > pivotElement) {
                    j--;
                }
                if (i < j) {
                    tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
            int tmp2;
            tmp2 = array[e];
            array[e] = array[i];
            array[i] = tmp2;
            sort(array, s, i - 1);
            sort(array, i + 1, e);
        }
        return array;
    }

}
