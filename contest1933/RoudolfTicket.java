import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int k = sc.nextInt();
            int[] barr = new int[n];
            int[] carr = new int[m];

            for(int i=0;i<n;i++){
                barr[i] = sc.nextInt();
            }
            for(int i=0;i<m;i++){
                carr[i] = sc.nextInt();
            }

            int count=0;
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    if(barr[i]+carr[j] <= k){
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }
}