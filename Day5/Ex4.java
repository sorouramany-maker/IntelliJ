package Day5;

public class Ex4 {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        System.out.println("Reverse array:");

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
