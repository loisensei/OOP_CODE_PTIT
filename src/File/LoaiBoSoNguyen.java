package File;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class LoaiBoSoNguyen {
    public static boolean isInteger(String s){
        try{
            Integer.parseInt(s);
        }catch(NumberFormatException e){
            return false;
        }
        return true;
    }
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("DATA.in");
        Scanner cin = new Scanner(file);
        List<String> list = new ArrayList<String>();
        while(cin.hasNext()){
            String s = cin.next();
            if(!isInteger(s)){
                list.add(s);
            }
        }
        Collections.sort(list);
        for(String i : list){
            System.out.print(i+" ");
        }
    }
}
