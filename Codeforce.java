import java.util.*;

public class Codeforce {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sum = sum + arr[i];
        }
        Arrays.sort(arr);

        int j = 0;
        int coin = 0;
        for (int i = n - 1; i >= 0; i--) {
            j = j + arr[i];
            coin++;
            if (j > sum / 2)
                break;
        }
        System.out.println(coin);
    }
}
