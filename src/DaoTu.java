import java.util.*;


public class DaoTu {
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        int t = Integer.parseInt(cin.nextLine());
        while(t-->0){
            String s = cin.nextLine();
            List<String> stk = Arrays.asList(s.split(" "));
            String res= "";
            for(String i : stk){
                res+= new StringBuilder(i).reverse() +" ";
            }
            System.out.println(res);
        }
    }
}
