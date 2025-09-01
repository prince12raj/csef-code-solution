import java.util.*;

public class SlidingWindowOr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        long x = sc.nextLong();
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();

        long[] arr = new long[n];
        arr[0] = x;
        for (int i = 1; i < n; i++) {
            arr[i] = (a * arr[i - 1] + b) % c;
        }

        long result = 0;
        long windowOr = 0;
        int i = 0, j = 0;

        while (j < n) {
            windowOr |= arr[j];

            if (j - i + 1 < k) {
                j++;
            } else if (j - i + 1 == k) {
                result ^= windowOr; 
                windowOr = 0;
                for (int t = i + 1; t <= j; t++) {
                    windowOr |= arr[t];
                }
                i++;
                j++;
            }
        }

        System.out.println(result);
        sc.close();
    }
}
