import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CU1901 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());

        printNum(n, 1);
    }

    private static void printNum(int num, int idx) {
        System.out.println(idx);

        if (idx == num) {
            return;
        }

        idx++;
        printNum(num, idx);
    }
}
