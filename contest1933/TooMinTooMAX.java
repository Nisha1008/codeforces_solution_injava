
import java.util.*;
public class TooMinTooMAX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            
            Arrays.sort(arr);
            int i=0;
            int k=1;
            System.out.println(Math.abs(arr[i]-arr[n-1]) + Math.abs(arr[n-1]-arr[k])+ Math.abs(arr[k]-arr[n-2])+Math.abs(arr[n-2]-arr[i]));
        }
    }

}
