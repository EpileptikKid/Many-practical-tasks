package java_core_task;//Дополнить пример 2.9 проверкой, все ли числа во введенной строке представляют собой цифры


public class task_4_15 {

    public static Integer sumNumber(String str){                        //функция суммировая цьіфр
        int sum = 0;
        for (int i = 0; i < str.length(); i++){                         //пробегаем по всем символам во входящей строке
            if (Character.isDigit(str.charAt(i))){                      //если символ цьіфра то прибавляем ее значение к сумме цьіфр
                sum += Integer.parseInt(str.charAt(i) + "");
            } else if ((str.charAt(i) == '-') & (i == 0)) {             //если символ не цьіфра то проверяем знак ли єто
                sum += 0;
            } else {                                                    //если єто не цьіфра и не знак то возвращвем null
                return null;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(args.length);
        for (String n : args){
            System.out.println(sumNumber(n));
        }
    }
}
