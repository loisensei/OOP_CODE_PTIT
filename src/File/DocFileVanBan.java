package File;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class DocFileVanBan {
    public static void main(String[] args) throws IOException {
        FileOutputStream file = new FileOutputStream("src/File/DATA.in");
        ObjectOutputStream oos = new ObjectOutputStream(file);
        ArrayList<Integer> list = new ArrayList<>();
        int i;
        for(i =1; i<=21;i++){
            list.add(i);
        }
        list.add(19);
        list.add(2);
        oos.writeObject(list);
        file.close();
        oos.close();
    }
}
