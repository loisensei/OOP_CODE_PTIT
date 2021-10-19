package com.company;
import java.util.Scanner;
import static java.lang.Math.sqrt;
public class ThuaSont {

    void Analysis(long n){
        for(int i=2;i<=sqrt(n);i++){
            if(n%i==0){
                int dem = 0;
                while(n%i==0){
                    n/=i;
                    dem++;
                }
                System.out.print(i+"(");
                System.out.print(dem+") ");
            }
        }
        if(n>1){
            System.out.println(n+"(1)");
        }else{
            System.out.println();
        }
    }

    public static void main(String[] args){
        Scanner ip = new Scanner(System.in);
        int t = ip.nextInt();
        int count = 1;
        while(t!=0){

            long n = ip.nextInt();
            System.out.print("Test "+count +": ");
            ThuaSont check = new ThuaSont();
            check.Analysis(n);
            t--;
            count++;
        }

    }
}
