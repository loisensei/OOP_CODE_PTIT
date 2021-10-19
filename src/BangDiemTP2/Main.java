package BangDiemTP2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int t = Integer.parseInt(cin.nextLine());
        ArrayList<Transcript> ds = new ArrayList<Transcript>();        while(t-->0){
            Transcript a = new Transcript(cin.nextLine(),cin.nextLine(),cin.nextLine(),Double.parseDouble(cin.nextLine()),Double.parseDouble(cin.nextLine()),Double.parseDouble(cin.nextLine()));
            ds.add(a);
        }
        Collections.sort(ds);
        for(int i=0; i< ds.size();i++){
            System.out.println((i+1)+" "+ds.get(i));
        }
    }
}
