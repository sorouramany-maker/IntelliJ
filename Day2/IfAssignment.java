package Day2;
import java.util.Scanner;
    public class IfAssignment {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            // Example 1: Largest of two numbers
            System.out.println("--- Example 1: Largest of two numbers ---");

            System.out.println("Please enter the first number: ");
            int num1 = scanner.nextInt();

            System.out.println("Please enter the second number: ");
            int num2 = scanner.nextInt();

//            Using if -else
            if (num1 > num2) {
                System.out.println("Largest using if-else: " + num1);
            } else {
                System.out.println("Largest using if-else: " + num2);
            }

//            Using ternary operator
            int largest = (num1 > num2) ? num1 : num2;

            System.out.println("Largest using ternary operator: " + largest);

//            Example 2:Smallest of 3 numbers
            System.out.println("\n--- Example 2: Smallest of 3 numbers ---");

            System.out.println("Please enter the first number: ");
            int a = scanner.nextInt();

            System.out.println("Please enter the second number: ");
            int b = scanner.nextInt();

            System.out.println("Please enter the third number: ");
            int c = scanner.nextInt();

            if (a <= b && a <= c) {
                System.out.println("The smallest number is: " + a);
            } else if (b <= a && b <= c) {
                System.out.println("The smallest number is: " + b);
            } else {
                System.out.println("The smallest number is: " + c);
            }

            // Example 3: Day number based on day name
            System.out.println("\n--- Example 3: Day number based on day name ---");

            System.out.println("Please enter the day name:");

            scanner.nextLine();

            String dayName = scanner.nextLine().trim();

            switch (dayName.toLowerCase()) {

                case "saturday":
                    System.out.println("Day number: 1");
                    break;

                case "sunday":
                    System.out.println("Day number: 2");
                    break;

                case "monday":
                    System.out.println("Day number: 3");
                    break;

                case "tuesday":
                    System.out.println("Day number: 4");
                    break;

                case "wednesday":
                    System.out.println("Day number: 5");
                    break;

                case "thursday":
                    System.out.println("Day number: 6");
                    break;

                case "friday":
                    System.out.println("Day number: 7");
                    break;

                default:
                    System.out.println("Invalid day name entered.");
            }

            scanner.close();
        }
    }

