import java.util.*;
public class A791 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int count=0;
        while(a<=b){
            count++;
            a = a*3;
            b = b*2;
        }
        System.out.println(count);
    }
}