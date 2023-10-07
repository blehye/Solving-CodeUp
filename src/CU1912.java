import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CU1912 {
    public static int result = 1;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());

        int num1 = 1;
        int num2 = 1;

        if (n == 1 || n == 2) {
            System.out.println(1);
        } else {
            test(num1, num2, n, 3);
        }

    }

    private static void test(int num1, int num2, int n, int idx) {
        int newNum1 = num2;
        int newNum2 = num1 + num2;

        if (n == idx) {
            System.out.println(newNum2);
            return;
        }

        idx++;
        test(newNum1, newNum2, n, idx);
    }
}
