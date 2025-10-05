import java.util.*;
public class Main1638 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      sc.close();
      int [] dp =new int[n+1];
      Arrays.fill(dp,Integer.MAX_VALUE);
      dp[0]=0;
       for(int i =1; i<=n;i++){
        int temp =i;
        while (temp>0){
            int digit = temp%10;
            temp/=10;
            if(digit!=0){
                dp[i]=Math.min(dp[i],dp[i-digit]+1);
            }

        }
        }
        System.out.println(dp[n]);
       }
    }
