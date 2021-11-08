package File;

import java.io.*;
import java.util.*;

public class SoKhacNhauTrongFile2 {
    public static void main(String[] args) throws IOException {
        LinkedHashMap<Integer,Integer> map = new LinkedHashMap<>();
        DataInputStream file = new DataInputStream(new FileInputStream("DATA.IN"));
        for(int i =1; i<= 100000; i++){
            int number = file.readInt();
            if (!map.containsKey(number)) {
                map.put(number, 0);
            }
            map.put(number, map.get(number) + 1);
        }
        List<Integer> keys = new ArrayList<>(map.keySet());
        Collections.sort(keys);
        for(Integer key : keys){
            System.out.println(key+" "+map.get(key));
        }
    }
}
