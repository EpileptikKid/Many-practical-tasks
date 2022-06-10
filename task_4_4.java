//В функции main() проинициализировать одномерный массив из 10 целых чисел
//Создать функцию, которая принимает в качестве параметра массив
//упорядочивает первые 4 элемента этого массива по возрастанию
//последние 4 – по убыванию. Результат вывести на экран.

public class task_4_4 {
    public static int[] doubleFourSort(int[] arr){
        int start = 4, finish = 4;
        int swapVar;

        for (int j = start-1; j > 0; j--) {
            for (int i = 0; i < j; i++) {
                if (arr[i] > arr[i + 1]) {
                    swapVar = arr[i + 1];
                    arr[i + 1] = arr[i];
                    arr[i] = swapVar;
                }
            }
        }

        for (int j = arr.length-1; j > arr.length - finish; j--) {
            for (int i = arr.length - finish; i < j; i++) {
                if (arr[i] < arr[i + 1]) {
                    swapVar = arr[i + 1];
                    arr[i + 1] = arr[i];
                    arr[i] = swapVar;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++){
            arr[i] = (int) (Math.random()*100);
            System.out.print(arr[i] + " ");
        }
        System.out.print("\n");
        int[] arr2 = doubleFourSort(arr);
        for (int i : arr2){
            System.out.print(i + " ");
        }
    }
}
