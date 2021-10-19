import java.util.*;

public class SoTamPhan {
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        int t = cin.nextInt();
        while(t-->0){
            String s = cin.next();
            boolean check = true;
            for(int i=0;i<s.length();i++){
                int tmp = Integer.parseInt(String.valueOf(s.charAt(i)));
                if(tmp!=0&&tmp!=1&&tmp!=2){
                    System.out.println("NO");
                    check=false;
                    break;
                }
            }
            if(check) System.out.println("YES");

        }
    }
}
