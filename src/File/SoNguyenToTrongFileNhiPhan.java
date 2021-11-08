package File;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.*;

import static java.lang.Math.sqrt;

public class SoNguyenToTrongFileNhiPhan {
    static boolean check(int n){
        if(n<2) return false;
        for(int i =2; i<= sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        LinkedHashMap<Integer,Integer> map = new LinkedHashMap<>();
        FileInputStream fis = new FileInputStream("SONGUYENTO.in");
        ObjectInputStream ois = new ObjectInputStream(fis);
        List<Integer> keys = new ArrayList<>();
        ArrayList<Integer> list = (ArrayList<Integer>) ois.readObject();
        for(Integer t : list) {
            if (check(t)) {
                keys.add(t);
                if (!map.containsKey(t)) {
                    map.put(t, 0);
                }
                map.put(t, map.get(t) + 1);
            }
        }
        Collections.sort(keys);
        for(Integer key : keys){
            System.out.println(key+" "+map.get(key));
        }

    }
}
