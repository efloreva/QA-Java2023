package qa.intro;

import java.util.Scanner;

public class MyFirstClass {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); //always add

        System.out.println("Please enter your name: ");

        String userName = scanner.nextLine();

        System.out.println("Welcome, " + userName + "!");

        System.out.println("What is your most favorite hobby?");

        String hobby = scanner.nextLine();

        if (hobby == ""){
            System.out.println("Come on, I know like to do something. Give it another try: ");
            hobby = scanner.nextLine();
            if (hobby == "") {
                System.out.println("Ok, keep your secrets. ;) *insert LOTR meme here*");
                return;
            } else {
                System.out.println("Your hobby is " + hobby + "?" + " Wow " + userName + ", that is so interesting! Tell me more over lunch?");
                return;
            }
        } else {
            System.out.println("Your hobby is " + hobby + "?" + " Wow " + userName + ", that is so interesting! Tell me more over lunch?");
        }
    }
}
