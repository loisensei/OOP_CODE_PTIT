import java.util.Arrays;
import java.util.Scanner;

public class HopHaiGiaySo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] a = new int[n+1];
        int[] b = new int[m+1];
        int[] c = new int[1000];
        Arrays.fill(c,0);
        int max = 0;
        for(int i =0;i<n;i++){
            a[i] = scanner.nextInt();
            if(a[i]>max) max=a[i];
            c[a[i]]++;
        }
        for(int i =0;i<m;i++){
            b[i] = scanner.nextInt();
            if(b[i]>max) max = b[i];
            c[b[i]]++;
        }
        for(int i = 0;i<=max;i++){
            if(c[i]==2){
                System.out.print(i+" ");
            }
        }

    }
}
