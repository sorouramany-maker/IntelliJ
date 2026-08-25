package Day5;

public class Ex5 {

    public static void main(String[] args) {

        int[] arr = {4, 7, 10, 13, 15, 17};

        for (int i = 0; i < arr.length; i++) {

            int number = arr[i];
            boolean prime = true;

            if (number < 2) {
                prime = false;
            }

            for (int j = 2; j < number; j++) {

                if (number % j == 0) {
                    prime = false;
                    break;
                }
            }

            if (prime) {
                System.out.println(number + " is prime");
            }
        }
    }
}
