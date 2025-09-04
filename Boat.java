import java.util.*;

public class Boat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] weights = new int[n];
            for (int i = 0; i < n; i++) {
                weights[i] = sc.nextInt();
            }

            int maxTeams = 0;
            for (int s = 2; s <= 2 * n; s++) {
                int[] freq = new int[n + 1];
                for (int w : weights) {
                    freq[w]++;
                }

                int teams = 0;
                for (int i = 1; i <= n; i++) {
                    int j = s - i;
                    if (j < 1 || j > n) continue;

                    if (i == j) {
                        teams += freq[i] / 2;
                    } else {
                        int min = Math.min(freq[i], freq[j]);
                        teams += min;
                        freq[i] -= min;
                        freq[j] -= min;
                    }
                }

                maxTeams = Math.max(maxTeams, teams);
            }

            System.out.println(maxTeams);
        }
    }
}