package com.company;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class BubbleSortReverse {

        static void sortt(int a[], int n) {
            String[] steplist = new String[n+1];
            int index = 1;
            for (int i = 0; i < n - 1; i++) {
                boolean check = false;
                for (int j = 0; j < n - i - 1; j++) {
                    if (a[j] > a[j + 1]) {
                        int tmp = a[j];
                        a[j] = a[j + 1];
                        a[j + 1] = tmp;
                        check = true;
                    }
                }
                if (check) {
                    steplist[index]="";
                    steplist[index]+="Buoc "+ String.valueOf(index) +": ";

                    for (int j = 0; j < n; j++) {
                        steplist[index]+=String.valueOf(a[j])+" ";
                    }
                    index++;

                }
            }
            for(int i=index-1;i>=1;i--){
                System.out.println(steplist[i]);
            }
        }

        public static void main(String[] args){
            Scanner cin = new Scanner(System.in);
            int t = cin.nextInt();
            while(t-->0) {
                int n = cin.nextInt();
                int[] a = new int[n + 5];
                for (int i = 0; i < n; i++) {
                    a[i] = cin.nextInt();
                }
                sortt(a, n);
            }
        }
}
