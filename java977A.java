import java.util.*;

public class java977A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        int k = sc.nextInt();
        while (k != 0) {
            long lastDig = num % 10;
            if (lastDig != 0) {
                num = num - 1;
            } else {
                num = num / 10;
            }
            k--;
        }
        System.out.println(num);
    }
}
