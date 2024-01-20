import java.util.*;

public class java_281A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char ch = str.charAt(0);
        String secondStr = str.trim().substring(1, str.length());

        if (ch >= 'a' && ch <= 'z') {
            int asci = (int) ch - 32;
            char first = (char) asci;
            System.out.println(first + secondStr);
        } else {
            System.out.println(str);
        }
    }
}
