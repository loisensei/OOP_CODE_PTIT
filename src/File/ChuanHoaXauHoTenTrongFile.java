package File;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ChuanHoaXauHoTenTrongFile {
    public static String chuanHoa(String s){
        String n = s.trim().toLowerCase().replaceAll("\\s+"," ");
        String[] name = n.split(" ");
        n = "";
        for(int i = 0; i< name.length;i++){
            n += String.valueOf(name[i].charAt(0)).toUpperCase() + name[i].substring(1);
            if(i<name.length-1){
                n+=" ";
            }
        }
        return n;
    }

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("DATA.in");
        Scanner cin = new Scanner(file);
        while(cin.hasNextLine()) {
            String s = cin.nextLine();
            if(s.equals("END")) break;
            System.out.println(chuanHoa(s));
        }

    }
}
