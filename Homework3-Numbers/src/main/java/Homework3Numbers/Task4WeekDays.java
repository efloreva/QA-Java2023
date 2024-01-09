package Homework3Numbers;
//Task: Напишете програма/ метод, която чете число от 1 до 7 в конзолата и на базата на това изписва в конзолата деня от седмицата във формат
//You have selected 1. Day of the week is Monday.

import java.util.Scanner;
//import java.time.DayOfWeek;

public class Task4WeekDays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please select a number from 1 to 7:");
        int dayNumber = scanner.nextInt();
        String dayOfWeek;

        switch (dayNumber){
            case 1:
                dayOfWeek = ("Monday");
                break;
            case 2:
                dayOfWeek = ("Tuesday");
                break;
            case 3:
                dayOfWeek = ("Wednesday");
                break;
            case 4:
                dayOfWeek = ("Thursday");
                break;
            case 5:
                dayOfWeek = ("Friday");
                break;
            case 6:
                dayOfWeek = ("Saturday");
                break;
            case 7:
                dayOfWeek = ("Sunday");
                break;
            default:
                dayOfWeek = ("Incorrect input for a day.");
        }

        System.out.println("Your selected number " + dayNumber + " is in fact " + dayOfWeek);

    }
}
