//Разработать функцию для перемножения двух матриц с проверкой размерностей и осуществить тестирование этой функции с проверкой возможных ошибок.

import java.util.Arrays;

public class task_4_14 {

    static double[][] multiplyMatrix(double[][] a, double[][] b){
        if(a == null || b == null || a[0].length != b.length){
            return null;
        }
        double[][] c = new double[a.length][b[0].length];
        for (int m = 0; m < a.length; m++){
            if (a[m].length != a[0].length) {
                return null;
            }
            for (int n = 0; n < b[m].length; n++){
                for (int p = 0; p < b.length; p++){

                    c[m][n] += a[m][p] * b[p][n];
                }
            }
        }
        return c;
    }

    static void printArr(double[][] c){
        if (c == null){
            System.out.println("Неправильньіе исходньіе данньіе!");
        } else {
            for (double[] q : c){
                System.out.println(Arrays.toString(q));
            }
        }
    }

    public static void main(String[] args) {
        double[][] a = {{1, 2, 1}, {0, 1, 2}, {1, 1, 1}};
        double[][] b = {{1, 0}, {0, 1}, {1, 1}};
        System.out.println("________________");
        if (a != null) {
            for (double[] q : a) {
                System.out.println(Arrays.toString(q));
            }
        }
        System.out.println("________________");
        if(b != null) {
            for (double[] q : b) {
                System.out.println(Arrays.toString(q));
            }
        }
        System.out.println("________________");
        printArr(multiplyMatrix(a, b));

    }
}
