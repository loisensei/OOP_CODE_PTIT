package TinhGio;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner cin = new Scanner(System.in);
        int t = Integer.parseInt(cin.nextLine());
        ArrayList<Gamer> ds = new ArrayList<>();
        while(t-->0){
            Gamer a = new Gamer(cin.nextLine(),cin.nextLine(),cin.nextLine(),cin.nextLine());
            ds.add(a);
        }
        Collections.sort(ds);
        for(Gamer i : ds){
            System.out.println(i);
        }
    }
}
