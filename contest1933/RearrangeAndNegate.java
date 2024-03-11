import java.util.*;

public class RearrangAndNegate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();

            int pos = 0;
            int neg = 0;

            for (int i = 0; i < n; i++) {
                int num = sc.nextInt();

                if (num > 0) {
                    pos += num;
                } else {
                    neg += num;
                }
            }
            System.out.println(pos + (-1 * neg));
        }
    }

}
