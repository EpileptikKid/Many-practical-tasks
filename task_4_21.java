//Осуществить форматирование текста с выравниванием по ширине
//Текст разбить на строки с длиной, не превосходящей заданного количества символов
//Если очередное слово не помещается в текущей строке, его необходимо переносить на следующую


import java.util.Scanner;

public class task_4_21 {

    public static void zeroCreator(int n){
        for (int i = 0; i < n; i++){
            System.out.print(" ");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку");
        String str = scanner.nextLine();
        System.out.println("Введите ширину строки");
        int size = scanner.nextInt();
        str = str.trim().replaceAll("\\s+", " ");
        String[] arrWords = str.split(" ");

        int[] arrSizeWords = new int[arrWords.length];
        for (int i = 0; i < arrSizeWords.length; i++){
            arrSizeWords[i] = arrWords[i].length();
        }

        int[] arrCountWords = new int[arrWords.length * 2];
        int sumChar = 0;
        int countWordsInLine = 0;
        int lineNumder = 0;
        for (int elemSizeWord : arrSizeWords) {
            if (sumChar + elemSizeWord < size) {
                sumChar += elemSizeWord + 1;
                countWordsInLine++;
            } else {
                arrCountWords[lineNumder] = countWordsInLine - 1;
                arrCountWords[lineNumder + 1] = size - sumChar + countWordsInLine;
                sumChar = elemSizeWord + 1;
                countWordsInLine = 1;
                lineNumder += 2;
            }
        }
        arrCountWords[lineNumder] = countWordsInLine-1;
        arrCountWords[lineNumder + 1] = size - sumChar + countWordsInLine;
        arrCountWords[lineNumder + 2] = -1;

        int[] arrZero = new int[arrWords.length];
        //Arrays.fill(arrZero, "");
        int numZero = 0;
        for (int i = 0; i < lineNumder / 2 + 1; i++){
            if (arrCountWords[i*2 + 2] != -1) {
                if (arrCountWords[i * 2] > 0) {

                    int q = arrCountWords[i * 2 + 1] / arrCountWords[i * 2];
                    int p = arrCountWords[i * 2 + 1] % arrCountWords[i * 2];

                    for (int m = 0; m < p; m++) {
                        arrZero[numZero] = q + 1;
                        numZero++;
                    }
                    for (int m = 0; m < arrCountWords[i * 2] - p; m++) {
                        arrZero[numZero] = q;
                        numZero++;
                    }

                }
                numZero++;
            } else {
                for (int m = 0; m < arrCountWords[i * 2]; m++){
                    arrZero[numZero] = 1;
                    numZero++;
                }
            }
        }

        for (int y = 0; y < arrWords.length; y++){
            System.out.print(arrWords[y]);
            if (arrZero[y] == 0){
                System.out.println();
            } else {
                zeroCreator(arrZero[y]);
            }
        }



    }
}
