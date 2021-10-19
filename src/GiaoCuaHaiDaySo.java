import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class GiaoCuaHaiDaySo {
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        int n,m;
        n = cin.nextInt();
        m = cin.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        for(int i=0;i<n;i++){
            a.add(cin.nextInt());
        }
        for(int i=0;i<m;i++){
            b.add(cin.nextInt());
        }
        Collections.sort(a);
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(a.get(i).equals(b.get(j))){
                    System.out.print(a.get(i)+" ");
                    break;
                }
            }
        }
    }
}
