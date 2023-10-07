import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CU1905 {

    public static int sum = 0;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int m = Integer.parseInt(st.nextToken());

        printSum(1, m);
    }

    private static void printSum(int n, int m) {
        sum += n;

        if (n == m) {
            System.out.println(sum);
            return;
        }

        n++;
        printSum(n, m);
    }
}
