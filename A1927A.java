import java.util.*;

public class A1927A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            int i = 0;
            int j = s.length() - 1;

            while (i <= j) {
                if (s.charAt(i) == 'W') {
                    i++;
                } else if (s.charAt(j) == 'W') {
                    j--;
                } else {
                    break;
                }
            }
            String ans = s.substring(i, j + 1);
            System.out.println(ans.length());
        }

    }
}
