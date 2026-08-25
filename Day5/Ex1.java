package Day5;

import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] arr = {10, 20, 30, 40, 50};

        System.out.print("Enter number to search: ");
        int number = input.nextInt();

        boolean found = false;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == number) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Number found");
        } else {
            System.out.println("Number not found");
        }
    }
}
