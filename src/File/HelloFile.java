package File;

import java.io.*;
import java.util.Scanner;

public class HelloFile {
    public static void main(String[] args) throws IOException {
//        Scanner in = new Scanner(new File("Hello.txt"));
//        while (in.hasNext()) {
//            System.out.println(in.next());
//        }
        DataInputStream in = new DataInputStream(new FileInputStream(new File("Hello.txt")));
        for(int i = 0; i< 500; i++){
            System.out.println(in.readLong());
        }
        in.close();
    }
}
