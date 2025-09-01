import java.util.*;

public class SlidindXor {
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
        long windowXor = 0;
        int i = 0, j = 0;

        while (j < n) {
            windowXor ^= arr[j];
            if (j - i + 1 < k) {
                j++;
            } else if (j - i + 1 == k) {
                result ^= windowXor; 
                windowXor ^= arr[i];
                i++;
                j++;
            }
        }

        System.out.println(result);
        sc.close();
    }
    
}
