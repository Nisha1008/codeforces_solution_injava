import java.util.*;

public class A546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstBCost = sc.nextInt();
        int totalDoller = sc.nextInt();
        int noOfBanana = sc.nextInt();
        int i = 1;
        int sum = 0;
        while (i <= noOfBanana) {
            sum += (firstBCost * i);
            i++;
        }
        if (sum <= totalDoller) {
            System.out.println("0");
        } else
            System.out.println(sum - totalDoller);
    }
}