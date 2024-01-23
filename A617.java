import java.util.*;

class A617 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int res = num / 5;

        if (num % 5 != 0) {
            res += 1;
        }
        System.out.println(res);
    }
}