//Fill an array with three hundred integers with consecutive positive values
//Replace all non-prime values with some negative value
//To do this, consistently exclude all numbers - divisors of other numbers (for 2 - 4, 6, 8 ..., for 3 - 9, 15, 21 ... etc.)
//Display remaining positive values (prime numbers)


public class task_4_10 {
    public static void main(String[] args) {
        int[] arr = new int[300];
        int size = arr.length;
        for (int i = 0; i < size; i++){
            arr[i] = i;
        }
        arr[0] = -1;
        arr[1] = -1;

        for (int i = 2; i < (size / 2); i++){
            for (int j = i*2; j < size; j+=i){
                arr[j] = -1;
            }
        }

        System.out.println("A number of prime numbers up to 300:");
        for (int n : arr){
            if (n != -1){
                System.out.print(n + " ");
            }
        }
    }
}
