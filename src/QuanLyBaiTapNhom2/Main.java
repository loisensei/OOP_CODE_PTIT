package QuanLyBaiTapNhom2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int m = cin.nextInt();
        cin.nextLine();
        ArrayList<Member> ds = new ArrayList<>();
        while(n-->0){
            Member a = new Member(cin.nextLine(),cin.nextLine(),cin.nextLine(),Integer.parseInt(cin.nextLine()));
            ds.add(a);
        }
        ArrayList<String> topic = new ArrayList<>();
        for(int i=1;i<=m;i++){
            String idea = cin.nextLine();
            for(Member j : ds){
                if(j.getGroupId()==i){
                    j.setTopic(idea);
                }
            }
        }
        Collections.sort(ds);
        for(Member i : ds){
            System.out.println(i);
        }

    }
}
