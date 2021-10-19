
import java.util.*;

public class HinhSao {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int t = cin.nextInt();
        Map<Integer, ArrayList<Integer>> a = new HashMap<>();
        for(int i=1;i<=t;i++){
            a.put(i,new ArrayList<Integer>());
        }
        int s =t;
        while(t-->1){
            int u = cin.nextInt();
            int v = cin.nextInt();

            a.get(u).add(v);
            a.get(v).add(u);
        }
        boolean check = false;
        Set<Integer> keys = a.keySet();
        for(Integer key : keys){
            if(a.get(key).size()==(s-1)){
                check = true;
            }
        }
        if(check) System.out.println("Yes");
        else System.out.println("No");
    }
}
