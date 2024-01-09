package HW2StringsActions;
//Task: Пребройте колко думи има в един стринг (разделете текста по space) - изпишете резултата в нея.
import java.util.Scanner;

public class Task3Split {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a sentence:");
        String sentence = scanner.nextLine();

        String[] splitted = sentence.split(" "); //split the entered data by space

        System.out.println("The entered sentence contains number of words: " + splitted.length);
    }
}
