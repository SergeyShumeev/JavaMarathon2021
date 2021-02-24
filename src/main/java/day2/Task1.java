package day2;

import java.awt.desktop.ScreenSleepEvent;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int count = scan.nextInt();

        if (count < 1) System.out.println("Ошибка ввода");
        else {
            if (count >= 1 && count <= 4) System.out.println("Малоэтажный дом");
            if (count >= 5 && count <= 8) System.out.println("Среднеэтажный дом");
            if (count >= 9) System.out.println("Многоэтажный дом");
        }
    }
}
