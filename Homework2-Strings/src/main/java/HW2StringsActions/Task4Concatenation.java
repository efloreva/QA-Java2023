package HW2StringsActions;
//Taks:     Обединете 2 и повече стринга в един и го изпишете в конзолата.

import java.util.Scanner;

public class Task4Concatenation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter 3 different strings in the next lines:");
        String line1 = scanner.nextLine();
        String line2 = scanner.nextLine();
        String line3 = scanner.nextLine();

        String combined = line1.concat(" " + line2 + " " + line3);

        System.out.println(combined);
    }
}
