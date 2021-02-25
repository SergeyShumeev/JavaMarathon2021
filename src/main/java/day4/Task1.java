package day4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * С клавиатуры вводится число n - размер массива.
 * Необходимо создать массив указанного размера и заполнить его случайными числами от 0 до 10.
 * Затем вывести содержимое массива в консоль, а также вывести в консоль информацию о:
 * а) Длине массива
 * б) Количестве чисел больше 8
 * в) Количестве чисел равных 1
 * г) Количестве четных чисел
 * д) Количестве нечетных чисел
 * е) Сумме всех элементов массива
 *
 * Пример:
 * Введено число 10. Сгенерирован следующий массив:
 * [4, 8, 4, 9, 5, 2, 2, 3, 3, 6]
 *
 * Информация о массиве:
 * Длина массива: 10
 * Количество чисел больше 8: 1
 * Количество чисел равных 1: 0
 * Количество четных чисел: 6
 * Количество нечетных чисел: 4
 * Сумма всех элементов массива: 46
 */
public class Task1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Random r = new Random();
        int n = scan.nextInt();
        int[] mas = new int[n];
        int i;
        int count = 0;

        for(i = 0; i < mas.length; i++)  { mas[i] = r.nextInt(10); }
        System.out.println(Arrays.toString(mas));

        System.out.println("Информация о массиве:");
        System.out.println("Длина массива: " + mas.length);

        for (i = 0; i < mas.length; i++){
            if (mas[i] > 8) count++;
        }
        System.out.println("Количество чисел больше 8: " + count);

        count = 0;
        for (i = 0; i < mas.length; i++){
            if (mas[i] == 1) count++;
        }
        System.out.println("Количество чисел равных 1: " + count);

        count = 0;
        for (i = 0; i < mas.length; i++){
            if (mas[i] % 2 == 0 && mas[i] != 0) count++;
        }
        System.out.println("Количество четных чисел: " + count);

        count = 0;
        for (i = 0; i < mas.length; i++){
            if (mas[i] % 2 != 0) count++;
        }
        System.out.println("Количество нечетных чисел: " + count);

        count = 0;
        for (i = 0; i < mas.length; i++) { count = count + mas[i]; }
        System.out.println("Сумма всех элементов массива: " + count);

    }
}
