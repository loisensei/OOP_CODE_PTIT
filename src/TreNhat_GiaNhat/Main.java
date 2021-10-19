package TreNhat_GiaNhat;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner cin = new Scanner(System.in);
        int t = Integer.parseInt(cin.nextLine());
        ArrayList<People> ds = new ArrayList<People>();
        while(t-->0){
            People a = new People(cin.next(), cin.next());
            ds.add(a);
        }
        Collections.sort(ds);
        System.out.println(ds.get(0).getName());
        System.out.println(ds.get(ds.size()-1).getName());
    }
}
