import java.util.Scanner;

public class SubArraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long x = sc.nextLong();
        long[] arr = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
        }

        long currentSum = 0;
        int left = 0;
        int right = 0; 
        long result = 0;

        while(right < n) {
            currentSum += arr[right];
            while (currentSum > x && left <= right) {
                currentSum -= arr[left];
                left++;
            }
            if (currentSum == x) {
                result++;
            }
            right++;
        }

        System.out.println(result);
    }
}
