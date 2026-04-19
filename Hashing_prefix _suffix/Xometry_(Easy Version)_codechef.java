import java.io.*;
import java.util.*;

public class Main {
    static int[] u = new int[5000005];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine());
        
        while (T-- > 0) {
            int N = Integer.parseInt(br.readLine());
            int[] A = new int[N];
            String[] inputArray = br.readLine().split(" ");
            for (int i = 0; i < N; i++) {
                A[i] = Integer.parseInt(inputArray[i]);
            }

            long c = 0;
            
            for (int i = 2; i < N; i++) {
                for (int j = i + 1; j < N; j++) {
                    u[A[i] ^ A[j]]++;
                }
            }

            c += u[A[0] ^ A[1]];

            for (int j1 = 2; j1 <= N - 3; j1++) {
                for (int i = j1 + 1; i < N; i++) {
                    int d = A[j1] ^ A[i];
                    u[d]--;
                }

                for (int i = j1 - 1; i >= 0; i--) {
                    int d = A[i] ^ A[j1];
                    c += u[d];
                }
            }

            for (int i = 0; i < N; i++) {
                for (int j = i + 1; j < N; j++) {
                    u[A[i] ^ A[j]] = 0;
                }
            }

            pw.println(c * 24);
        }
        
        pw.flush();
    }
}
