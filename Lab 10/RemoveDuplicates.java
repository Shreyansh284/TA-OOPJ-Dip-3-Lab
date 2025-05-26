import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] temp = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int j = 0;
        for (int i = 0; i < n; i++) {
            boolean found = false;
            for (int k = 0; k < j; k++) {
                if (arr[i] == temp[k]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                temp[j++] = arr[i];
            }
        }
        for (int i = 0; i < j; i++) {
            System.out.print(temp[i] + " ");
        }
    }
}
