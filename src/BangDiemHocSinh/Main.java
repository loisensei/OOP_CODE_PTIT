package BangDiemHocSinh;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int t = Integer.parseInt(cin.nextLine());
        ArrayList<Transcript> ds = new ArrayList<>();
        for(int i=1;i<=t;i++) {
            Transcript a = new Transcript(i);
            a.setStudentName(cin.nextLine());
            ArrayList<Double> b = new ArrayList<>();
            for(int j=1;j<=10;j++){
                b.add(cin.nextDouble());
            }
            cin.nextLine();
            a.setListPoints(b);
            ds.add(a);
        }
        Collections.sort(ds);
        for(Transcript i : ds){
            System.out.println(i);
        }
    }
}
