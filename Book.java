import java.util.Scanner;

public class Book {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        int t = sc.nextInt(); 

        int[] a = new int[n]; 
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int i = 0, j= 0;
        int currentSum = 0;
        int maxBooks = 0;

        while (j < n) {
            currentSum += a[j];

            while (currentSum > t) {
                currentSum -= a[i];
                i++;
            }

            maxBooks = Math.max(maxBooks, j - i + 1);
            j++;
        }

        System.out.println(maxBooks);
    }
}