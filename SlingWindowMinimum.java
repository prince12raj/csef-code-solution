import java.util.*;

public class SlingWindowMinimum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
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

        Deque<Integer> dq = new ArrayDeque<>();
        long result = 0;

        int i = 0;
        for (int j = 0; j < n; j++) {
            while (!dq.isEmpty() && arr[dq.peekLast()] >= arr[j]) {
                dq.pollLast();
            }
            dq.offerLast(j);
            while (!dq.isEmpty() && dq.peekFirst() < i) {
                dq.pollFirst();
            }
            if (j - i + 1 == k) {
                long minVal = arr[dq.peekFirst()];
                result ^= minVal;
                i++;
            }
        }

        System.out.println(result);
        sc.close();
    }
}
