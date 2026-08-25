package Day5;

import java.util.Scanner;

public class Grades {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int sum = 0;
        int highest = 0;
        int lowest = 100;

        for (int i = 1; i <= 5; i++) {

            System.out.print("Enter grade " + i + ": ");
            int grade = input.nextInt();

            sum += grade;

            if (grade > highest) {
                highest = grade;
            }

            if (grade < lowest) {
                lowest = grade;
            }
        }

        double average = (double) sum / 5;

        System.out.println("Average = " + average);
        System.out.println("Highest = " + highest);
        System.out.println("Lowest = " + lowest);
    }
}
