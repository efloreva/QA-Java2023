package Homework3Numbers;
//Task: Напишете програма/ метод, която приема от конзолата 3 подадени числа, определя кое е най-голяматo

import java.util.Scanner;

public class Task1GreaterNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter three numbers on separate lines:");

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        int larger = Math.max(num1,num2);

        System.out.println("Largest number among the three is: " + Math.max(larger,num3));
    }
}