import java.util.*;

public class problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            String str = "";
            char ch = 'a';
            for (int i = 0; i < k; i++) {
                str = str + ch;
                ch++;
            }
            String ans = "";
            for (int i = 0; i < n; i++) {
                ans = ans + str;
            }
            System.out.println(ans);
        }
    }
}
