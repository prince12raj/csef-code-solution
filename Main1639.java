import java.util.*;
public class Main1639 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int dp [][] =new int[n+1][n+1];
        for(int i =0; i<n; i++){
            for(int j =0; j<n;j++){
                dp[i][j]=Integer.MAX_VALUE;
            }
        }
    }
    
}
