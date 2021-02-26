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
        Random random = new Random();
        int[] array = new int[100];
        int[] counter = new int[4];

        for (int i = 0; i < array.length; i++){
            array[i] = random.nextInt(10000);
        }

        System.out.println(Arrays.toString(array));

        counter[0] = array[0];
        counter[1] = array[0];
        counter[2] = 0;
        counter[3] = 0;
        for(int mas2 : array){
            if (mas2 > counter[0]) counter[0] = mas2;
            if (mas2 < counter[1]) counter[1] = mas2;
            if (mas2 % 10 == 0) counter[2] = counter[2] + 1;
            if (mas2 % 10 == 0) counter[3] = counter[3] + mas2;
        }
        System.out.println("Наибольший элемент массива: " + counter[0]);
        System.out.println("Наименьший элемент массива: " + counter[1]);
        System.out.println("Количество элементов массива, оканчивающихся на 0: " + counter[2]);
        System.out.println("Сумма элементов массива, оканчивающихся на 0: " + counter[3]);

    }
}
