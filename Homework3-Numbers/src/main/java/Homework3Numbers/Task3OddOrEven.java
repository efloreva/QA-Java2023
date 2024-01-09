package Homework3Numbers;

import java.util.Scanner;

//Task: Напишете програма/ метод, която чете число и изписва в конзолата дали числото е четно или не?
public class Task3OddOrEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number:");

        int num = scanner.nextInt();

        if (num % 2 == 1) {
            System.out.println(num + " is an odd number.");

        } else if(num % 2 == 0){
            System.out.println(num + " is an even number.");
        }
    }
}
