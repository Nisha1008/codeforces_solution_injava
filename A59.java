import java.util.*;

public class A59 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int lower = 0;
        int upper = 0;
        for (char ch : str.toCharArray()) {
            if (ch >= 'A' && ch <= 'Z') {
                upper++;
            } else {
                lower++;
            }
        }

        if (lower >= upper) {
            System.out.println(str.toLowerCase());
        } else {
            System.out.println(str.toUpperCase());
        }
    }
}
