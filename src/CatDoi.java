

import java.util.Scanner;

public class CatDoi {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int t = cin.nextInt();
        while(t-->0){
            String s = cin.next();
            boolean check = true;
            StringBuilder result = new StringBuilder();
            for(int i=0;i<s.length();i++){
                String tmp = String.valueOf(s.charAt(i));
                if(tmp.equals("0")) result.append(tmp);
                else if(tmp.equals("1")) result.append("1");
                else if(tmp.equals("8")) result.append("0");
                else if(tmp.equals("9")) result.append("0");
                else{
                    check = false;
                    break;
                }
            }
            if(!check) System.out.println("INVALID");
            else {
                Long a = Long.valueOf(result.toString());
                if(a.equals(Long.valueOf("0"))){
                    System.out.println("INVALID");
                }else {
                    System.out.println(a);
                }
            }
        }
    }
}
