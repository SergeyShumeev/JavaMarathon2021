package day2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Double x = scan.nextDouble();

        if (x <= -3) System.out.println(420);
        else {
            if ((x < -3) && (x > 5))     System.out.println((x + 3) * (Math.pow(x, 2) - 2));
            if (x >= 5)                  System.out.println((x*x - 10) / (100 + 7));
        }
                    // Обошёлся без переменной y
    }
}
