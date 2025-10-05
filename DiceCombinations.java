import java.util.*;

public class DiceCombinations {
    static final int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        long[] dp = new long[n + 1];
        dp[0] = 1; // base case

        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= 6; k++) {
                if (i - k >= 0) {
                    dp[i] = (dp[i] + dp[i - k]) % MOD;
                }
            }
        }

        System.out.println(dp[n]);
    }
}
