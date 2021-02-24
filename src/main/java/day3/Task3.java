package day3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double dividend;
        double divider;
        int i = 0;

        while (i < 5){

            dividend = scanner.nextInt();
            divider = scanner.nextInt();

            if (divider == 0) {
                    System.out.println("Деление на 0");
                    i--;
                }
            if (divider != 0) System.out.println(dividend / divider);

            i++;
        }
    }
}
