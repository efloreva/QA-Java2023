package HW2StringsActions;
//Task: Сравнете 2 стринга дали са еднакви - подадени от конзолата и изпишете резултата в нея.

import java.util.Scanner;

public class Task2Compare {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a string or email to compare:");
        String line1 = scanner.nextLine();
        System.out.println("Please enter again a string or email to compare them:");
        String line2 = scanner.nextLine();

        System.out.println(line1.equals(line2) ? "Both strings are equal." : "The strings are not equal.");
    }
}
