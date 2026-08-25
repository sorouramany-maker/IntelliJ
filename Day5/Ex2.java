package Day5;

import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] arr = {1, 2, 3, 2, 4, 2, 5};

        System.out.print("Enter number: ");
        int number = input.nextInt();

        int count = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == number) {
                count++;
            }
        }

        System.out.println("Number of repetitions = " + count);
    }
}
