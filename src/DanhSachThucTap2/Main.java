package DanhSachThucTap2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int t = Integer.parseInt(cin.nextLine());
        ArrayList<Businesses> ds = new ArrayList<Businesses>();
        for(int i=1 ;i<=t ; i++){
            Businesses a= new Businesses(i,cin.nextLine(),cin.nextLine(),cin.nextLine(),cin.nextLine(),cin.nextLine());
            ds.add(a);
        }
        Collections.sort(ds);
        int q = Integer.parseInt(cin.nextLine());
        while(q-->0){
            String company = cin.nextLine();
            for(Businesses i : ds){
                if(i.getNameBusiness().equals(company)){
                    System.out.println(i);
                }
            }
        }
    }
}
