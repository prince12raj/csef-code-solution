import java.util.Scanner;

public class VasyaAndString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String s = sc.next();

        int maxLen = 0;
        for (char target : new char[]{'a', 'b'}) {
            int i = 0, j = 0, count = 0;

            while (j < n) {
                if (s.charAt(j) != target) {
                    count++;
                }

                while (count > k) {
                    if (s.charAt(i) != target) {
                        count--;
                    }
                    i++;
                }

                maxLen = Math.max(maxLen, j - i + 1);
                j++;
            }
        }

        System.out.println(maxLen);
        sc.close();
    }
}