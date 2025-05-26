import java.util.Scanner;

public class SecondMinMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");

        int n = sc.nextInt();
        if (n < 2) {
            System.out.println("Array must contain at least two elements.");
            return;
        }
        System.out.println("Enter the elements of the array:");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

         for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        if (arr.length==2) {
            System.out.println("Array has only two elements.");
            System.out.println(" Smallest: " + arr[0]);
            System.out.println(" Largest: " + arr[1]);
            return;
        }
        System.out.println("Second Smallest: " + arr[1]);
        System.out.println("Second Largest: " + arr[n - 2]);
    }
}
