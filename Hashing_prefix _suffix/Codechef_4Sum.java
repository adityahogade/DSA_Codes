import java.util.*;

class Codechef_4Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int T = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        Map<Integer, Integer> hm = new HashMap<>();

       

        long c = 0;

        for (int j = n-3; j >0; j--) {

            
            for (int k = j+2; k < n; k++) {
                int val = arr[k] + arr[j+1];
                hm.put(val, hm.getOrDefault(val, 0) + 1);
            }

            for (int i = 0; i < j; i++) {
                int needed = T- (arr[i] + arr[j]);
                int freq = hm.getOrDefault(needed, 0);
                c+=freq;
            }
        }

        System.out.println(c);
    }
}