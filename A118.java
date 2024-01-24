import java.util.*;

public class A118 {
    public static boolean isVowel(char ch) {
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'y') {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder(str.toLowerCase());
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < sb.length(); i++) {
            char ch = sb.charAt(i);
            if (isVowel(ch)) {
                sb.delete(i, i);
            } else if (!isVowel(ch)) {
                ans.append('.');
                ans.append(ch);
            }
        }
        System.out.println(ans);
    }
}
