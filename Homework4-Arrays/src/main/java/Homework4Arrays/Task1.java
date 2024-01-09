package Homework4Arrays;

public class Task1 {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= n; i++) {
            System.out.printf("Current number is: %d\n", i);
        }

        System.out.printf("-----------\n");

        printNumbers(n);

    }

    public static void printNumbers(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.printf("Current number is: %d\n", i);
        }
    }
}
