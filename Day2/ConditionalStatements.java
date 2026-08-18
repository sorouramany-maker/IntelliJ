package Day2;
import java.util.Scanner;

public class ConditionalStatements {
    public static void main(String[] args) {

       Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Please Enter Number To Check");
//        int numberToCheck = scanner.nextInt();
//
//        if (numberToCheck % 2 == 0) {
//            System.out.println("Even");
//        } else {
//            System.out.println("Odd");
//                      EX
//
//        System.out.println("Please Enter Number To Check ");
//        int numberToCheck = scanner.nextInt();
//
//        if (numberToCheck > 0) {
//            System.out.println("Positive");
//        } else if (numberToCheck < 0) {
//            System.out.println("Negative");
//        } else {
//            System.out.println("Zero");
//        }
//        scanner.close();
//                      EX
//        System.out.println("Please Enter first number ");
//        int num1 = scanner.nextInt();
//
//        System.out.println("Please Enter second number ");
//        int num2 = scanner.nextInt();
//
//        System.out.println("Please Enter third number ");
//        int num3 = scanner.nextInt();
//
//        if (num1 > num2 && num1 > num3) {
//            System.out.println("The first number is the largest");
//        } else if (num2 > num1 && num2 > num3) {
//            System.out.println("The second number is the largest");
//        } else {
//            System.out.println("The third number is the largest");
//                    EX
        System.out.println("Please enter a day number (1-7): ");
        int dayNumber = scanner.nextInt();

        switch (dayNumber) {
            case 1:
                System.out.println("Saturday");
                break;
            case 2:
                System.out.println("Sunday");
                break;
            case 3:
                System.out.println("Monday");
                break;
            case 4:
                System.out.println("Tuesday");
                break;
            case 5:
                System.out.println("Wednesday");
                break;
            case 6:
                System.out.println("Thursday");
                break;
            case 7:
                System.out.println("Friday");
                break;
            default:
                System.out.println("Invalid day number! Please enter a number between 1 and 7.");
        }

        scanner.close();
    }
        }
