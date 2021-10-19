package com.company;
import java.util.*;
public class UocChiaHet2 {
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        int t = cin.nextInt();
        while(t-->0){
            long n = cin.nextLong();
            int count = 0;
            int index = 1;
            while(index<=n/index){
                if(n%index==0){
                    if(index%2==0) count++;
                    if(n/index%2==0) count++;
                    if(n/index==index && index%2==0) count--;
                }
                index++;
            }
            System.out.println(count);
        }
    }
}
