package Day5;

import java.util.Scanner;

public class Month {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter month number: ");
        int number = input.nextInt();

        System.out.println("Month: " + getMonthName(number));

        input.nextLine(); // تنظيف الـ Enter

        System.out.print("Enter month name: ");
        String name = input.nextLine();

        System.out.println("Month number: " + getMonthNumber(name));
    }

    // من الرقم إلى اسم الشهر
    public static String getMonthName(int number) {

        switch (number) {
            case 1:
                return "January";
            case 2:
                return "February";
            case 3:
                return "March";
            case 4:
                return "April";
            case 5:
                return "May";
            case 6:
                return "June";
            case 7:
                return "July";
            case 8:
                return "August";
            case 9:
                return "September";
            case 10:
                return "October";
            case 11:
                return "November";
            case 12:
                return "December";
            default:
                return "Invalid month";
        }
    }

    // من اسم الشهر إلى الرقم
    public static int getMonthNumber(String name) {

        switch (name.toLowerCase()) {
            case "january":
                return 1;
            case "february":
                return 2;
            case "march":
                return 3;
            case "april":
                return 4;
            case "may":
                return 5;
            case "june":
                return 6;
            case "july":
                return 7;
            case "august":
                return 8;
            case "september":
                return 9;
            case "october":
                return 10;
            case "november":
                return 11;
            case "december":
                return 12;
            default:
                return -1;
        }
    }
}
