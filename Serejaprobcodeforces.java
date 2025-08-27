import java.util.Scanner;

public class Serejaprobcodeforces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int i = 0, j = n - 1, s = 0, d = 0, t = 1;

        while (i <= j) {
            int pick;
            if (arr[i] > arr[j]) {
                pick = arr[i];
                i++;
            } else {
                pick = arr[j];
                j--;
            }
            if (t % 2 == 1) {   
                s += pick;
            } else {           
                d += pick;
            }
            t++;
        }

        System.out.println(s + " " + d);
    }
}
