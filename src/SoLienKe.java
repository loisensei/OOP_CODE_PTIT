import java.util.Scanner;

public class SoLienKe {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int t = cin.nextInt();
        while(t-->0){
            String s = cin.next();
            boolean check = true;
            for(int i = 0; i<s.length()-1;i++){
                int a = Integer.parseInt(String.valueOf(s.charAt(i)));
                int b = Integer.parseInt(String.valueOf(s.charAt(i+1)));
                if(Math.abs(a-b)!=1){
                    check = false;
                    break;
                }
            }
            if(check){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
