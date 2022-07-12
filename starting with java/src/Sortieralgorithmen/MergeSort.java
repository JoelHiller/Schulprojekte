package Sortieralgorithmen;


import java.util.Scanner;

public class MergeSort {
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
        int length = array.length;
        int[] sorted = mergeSort(array, 0, length - 1);
        System.arraycopy(sorted, 0, array, 0, length);
        return sorted;
    }

    private static int[] mergeSort(int[] array, int left, int right) {
        if (left == right) return new int[]{array[left]};

        int middle = left + (right - left) / 2;
        int[] leftArray = mergeSort(array, left, middle);
        int[] rightArray = mergeSort(array, middle + 1, right);
        return merge(leftArray, rightArray);
    }

    static int[] merge(int[] leftArray, int[] rightArray) {
        int leftLength = leftArray.length;
        int rightLength = rightArray.length;

        int[] target = new int[leftLength + rightLength];
        int targetPosition = 0;
        int leftPosition = 0;
        int rightPosition = 0;

        while (leftPosition < leftLength && rightPosition < rightLength) {
            int leftValue = leftArray[leftPosition];
            int rightValue = rightArray[rightPosition];
            if (leftValue <= rightValue) {
                target[targetPosition++] = leftValue;
                leftPosition++;
            } else {
                target[targetPosition++] = rightValue;
                rightPosition++;
            }
        }
        while (leftPosition < leftLength) {
            target[targetPosition++] = leftArray[leftPosition++];
        }
        while (rightPosition < rightLength) {
            target[targetPosition++] = rightArray[rightPosition++];
        }
        return target;
    }


}