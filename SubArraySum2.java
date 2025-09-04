import java.util.Scanner;

public class SubArraySum2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long x = sc.nextLong();
        long[] arr = new long[n];
        for (int k = 0; k < n; k++) {
            arr[k] = sc.nextLong();
        }

        long currentSum = 0;
        int j = 0;
        int i = 0;
        long result = 0;

        while (i < n) {
            currentSum += arr[i];
            while (currentSum > x && j <= i) {
                currentSum -= arr[j];
                j++;
            }
            if (currentSum == x) {
                result++;
            }
            i++;
        }

        System.out.println(result);
    }
}