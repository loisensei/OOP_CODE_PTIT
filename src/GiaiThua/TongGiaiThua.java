package GiaiThua;

import java.util.Scanner;

public class TongGiaiThua {
    public static long giaiThua(int n){
        long s = 1;
        for(int i=1;i<=n;i++){
            s*=i;
        }
        return s;
    }
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        long sum=0;
        for(int i=1;i<=n;i++){
            sum+=giaiThua(i);
        }
        System.out.println(sum);
    }

}
