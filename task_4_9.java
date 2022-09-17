//In the main() function, initialize a two-dimensional array of m x n integers
//Create a function that takes an array as a parameter, finds the maximum element from the minimum elements of the array strings and returns it
//Displays the result on the screen.

import java.util.Scanner;

public class task_4_9 {

    public static int maxOfMinArr(int[][] arr){
        int[] arrMin = new int[arr.length];
        for (int i = 0; i < arr.length; i++){
            arrMin[i] = arr[i][0];
            for (int j = 1; j < arr[i].length; j++){
                if (arr[i][j] < arrMin[i]) arrMin[i] = arr[i][j];
            }
        }
        int max = arrMin[0];
        for (int i = 1; i < arrMin.length; i++){
            if (max < arrMin[i]) max = arrMin[i];
        }
        return max;
    }

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter m and n");
            int m = scanner.nextInt();
            int n = scanner.nextInt();
            int[][] arr = new int[m][n];
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    arr[i][j] = (int) (Math.random() * 100);
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println("The maximum element among the minimum - " + maxOfMinArr(arr));
        } catch (Exception e) {
            System.out.println("The entered data is incorrect");
        }
    }
}
