import java.util.*;

public class Main1634 {
    static final int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] coins = new int[n];
        for (int i = 0; i < n; i++) {
            coins[i] = sc.nextInt();
        }

        long[] dp = new long[x + 1];
        dp[0] = 1; 
        for (int s = 1; s <= x; s++) {
            for (int c : coins) {
                if (s - c >= 0) {
                    dp[s] = (dp[s] + dp[s - c]) % MOD;
                }
            }
        }

        System.out.println(dp[x]);
    }
}
