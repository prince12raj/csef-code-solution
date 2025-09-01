import java.util.*;
public class SlidingWindowDistinctValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        Map<Integer, Integer> mp = new HashMap<>();
        List<Integer> result = new ArrayList<>();

        int i = 0, j = 0;

        while(j < n){
            mp.put(arr[j], mp.getOrDefault(arr[j], 0) + 1);
            if(j - i + 1 == k){
                result.add(mp.size());
                if(mp.get(arr[i]) > 1){
                    mp.put(arr[i], mp.get(arr[i]) - 1);
                } else {
                    mp.remove(arr[i]);
                }
                i++;
            }

            j++;
        }
        for(int val : result){
            System.out.print(val + " ");
        }
    }
}
