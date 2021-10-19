package timesort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int t = cin.nextInt();
        ArrayList<Time> ds = new ArrayList<>();
        while(t-->0){
            Time a = new Time(cin.nextInt(),cin.nextInt(),cin.nextInt());
            ds.add(a);
        }
        Collections.sort(ds);
        for(Time i : ds){
            System.out.println(i);
        }
    }
}
