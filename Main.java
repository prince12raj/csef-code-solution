import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int x = sc.nextInt(); 
        int[] coins = new int[n];
        
        for (int i = 0; i < n; i++) {
            coins[i] = sc.nextInt();
        }
        
        int INF = 1000000000;
        int[] dp = new int[x + 1];
        Arrays.fill(dp, INF);
        dp[0] = 0;
        
        for (int s = 1; s <= x; s++) {
            for (int c : coins) {
                if (c <= s) {
                    dp[s] = Math.min(dp[s], dp[s - c] + 1);
                }
            }
        }
        
        System.out.println(dp[x] == INF ? -1 : dp[x]);
    }
}
