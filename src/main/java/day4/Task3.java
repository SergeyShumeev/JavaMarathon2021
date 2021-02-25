package day4;

import java.util.Random;

/**
 * 3. Заполнить двумерный массив (матрицу) случайными числами от 0 до 50.
 * Размер матрицы задать m=12, n=8 (m - размерность по строкам, n - размерность по колонкам).
 * В консоль вывести индекс строки, сумма чисел в которой максимальна. Если таких строк несколько, в
 * ывести индекс последней из них.
 *
 * Пример сгенерированной матрицы (для простоты m=3, n=5):
 *
 * 3 2 1 5 7 	// сумма - 18
 * 1 2 5 6 2 	// сумма - 16
 * 3 4 9 6 4	// сумма - 26
 *
 * Ответ: 2 (индекс строки, сумма чисел в которой максимальна)
 */
public class Task3 {
    public static void main(String[] args) {

        Random r = new Random();
        int [][] matrice = new int[12][8];
        int count1 = 0, count2 = 0;
        int i, j, index = 0;

        for (i = 0; i < matrice.length; i++) {
            for (j = 0; j < matrice[i].length; j++) {
               matrice[i][j] = r.nextInt(50);
               System.out.print(matrice[i][j] + " ");
               count1 = count1 + matrice[i][j];
            }
            System.out.println("        " + count1);

            if (count2 < count1) {
                count2 = count1;
                index = i;
            }
            count1 = 0;
        }
        System.out.println("Индекс: " + index);

    }
}
