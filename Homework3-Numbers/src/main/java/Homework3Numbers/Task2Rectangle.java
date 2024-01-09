package Homework3Numbers;
//Task: Напишете програма/ метод, която за подадени дължина и височина на правоъгълник, изкарват на конзолата неговият периметър и лице

import java.util.Scanner;

public class Task2Rectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter length parameter for rectangle: ");
        int a = scanner.nextInt();

        System.out.println("Please enter height parameter for rectangle: ");
        int b = scanner.nextInt();

        System.out.println(a*b + " is the area of the rectangle.");
        System.out.println(2*(a+b) + " is the perimeter of the rectangle.");
    }
}
