package File;

import java.io.*;
import java.util.Scanner;

public class TinhTong {
    public static boolean isInteger(String s){
        try{
            Integer.parseInt(s);
        }catch(NumberFormatException e){
            return false;
        }
        return true;
    }
    public static void main(String[] args) throws IOException {
        File file = new File("src/File/DATA.in");
        Scanner cin = new Scanner(file);
        long sum =0;
        while(cin.hasNext()){
            String s = cin.next();
            if(!s.contains("[a-zA-Z]+") && isInteger(s)){
                int n = Integer.parseInt(s);
                sum += n;
            }
        }
        System.out.println(sum);
    }
}
