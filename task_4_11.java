//Initialize a one-dimensional array of integers with random values
//Sort an array using selection sort. The algorithm is as follows:
//find the number of the minimum value in the current list;
//we exchange this value with the value of the first unsorted position (the exchange is not needed if the minimum element is already at this position);
//sort the tail of the list, excluding already sorted elements from consideration.
//Display the result on the screen.

import java.util.Scanner;

public class task_4_11 {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the size of the array:");
            int sizeArray = scanner.nextInt();
            int[] arr = new int[sizeArray];

            System.out.println("Array:");
            for (int i = 0; i < sizeArray; i++) {
                arr[i] = (int) (Math.random() * 200 - 100);
                System.out.print(arr[i] + " ");
            }

            System.out.println("\nSorted array:");
            for (int i = 0; i < sizeArray - 1; i++) {
                int min_index = i;
                for (int j = i + 1; j < sizeArray; j++) {
                    if (arr[j] < arr[min_index]) {
                        min_index = j;
                    }
                }
                if (min_index != i) {
                    int extraVar = arr[min_index];
                    arr[min_index] = arr[i];
                    arr[i] = extraVar;
                }
            }

            for (int n : arr) {
                System.out.print(n + " ");
            }
        } catch (Exception e) {
            System.out.println("The entered data is incorrect");
        }
    }
}
