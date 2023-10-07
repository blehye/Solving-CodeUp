import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CU1904 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        printOdd(n, m);
    }

    private static void printOdd(int n, int m) {
        if (n % 2 == 0) {
            n += 1;
        }

        if (n > m) {
            return;
        }

        System.out.println(n);

        printOdd(n + 2, m);
    }
}
