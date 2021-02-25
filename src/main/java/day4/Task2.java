package day4;

import java.util.Arrays;
import java.util.Random;

/**
 * 2. Создать новый массив размера 100 и заполнить его случайными числами из диапазона от 0 до 10000.
 * Затем, используя цикл for each вывести в консоль:
 * наибольший элемент массива
 * наименьший элемент массива
 * количество элементов массива, оканчивающихся на 0
 * сумму элементов массива, оканчивающихся на 0
 *
 * Использовать сортировку запрещено.
 */

public class Task2 {
    public static void main(String[] args) {
        Random r = new Random();
        int[] mas = new int[100];
        int i;
        int count;

        for (i = 0; i < mas.length; i++){
            mas[i] = r.nextInt(10000);
        }

        System.out.println(Arrays.toString(mas));

        count = mas[0];
        for(int mas2 : mas){
            if (mas2 > count) count = mas2;
        }
        System.out.println("Наибольший элемент массива: " + count);

        count = mas[0];
        for(int mas2 : mas){
            if (mas2 < count) count = mas2;
        }
        System.out.println("Наименьший элемент массива: " + count);

        count = 0;
        for(int mas2 : mas){
            if (mas2 % 10 == 0) count = count + 1;
        }
        System.out.println("Количество элементов массива, оканчивающихся на 0: " + count);

        count = 0;
        for(int mas2 : mas){
            if (mas2 % 10 == 0) count = count + mas2;
              }
        System.out.println("Сумма элементов массива, оканчивающихся на 0: " + count);

    }
}
