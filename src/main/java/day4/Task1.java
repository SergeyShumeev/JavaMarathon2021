package day4;           // Task1

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int[] array = new int[scanner.nextInt()];
        int[] counter = new int[5];   //создаю массив счётчика для каждой формулы

         for (int i = 0; i < array.length; i++){               // Одним циклом заполняю все ячейки матриц
            array[i] = random.nextInt(10);
            if (array[i] > 8) counter[0]++;
            if (array[i] == 1) counter[1]++;
            if (array[i] % 2 == 0 && array[i] != 0) counter[2]++; else counter[3]++;        // Использую else в качестве противоположности
            counter[4] = counter[4] + array[i];
        }

        System.out.println(Arrays.toString(array));
        System.out.println("Информация о массиве:");
        System.out.println("Длина массива: " + array.length);
        System.out.println("Количество чисел больше 8: " + counter[0]);
        System.out.println("Количество чисел равных 1: " + counter[1]);
        System.out.println("Количество четных чисел: " + counter[2]);
        System.out.println("Количество нечетных чисел: " + counter[3]);
        System.out.println("Сумма всех элементов массива: " + counter[4]);

    }
}
