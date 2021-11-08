package File;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class SoKhacNhauTrongFile1 {
    public static void main(String[] args) throws FileNotFoundException {
        LinkedHashMap<Integer,Integer> map = new LinkedHashMap<>();
        File file = new File("DATA.in");
        Scanner cin = new Scanner(file);
        while(cin.hasNext()){
            Integer number = cin.nextInt();
            if(!map.containsKey(number)){
                map.put(number,0);
            }
            map.put(number,map.get(number)+1);
        }
        List<Integer> keys = new ArrayList<>(map.keySet());
        Collections.sort(keys);
        for(Integer key : keys){
            System.out.println(key+" "+map.get(key));
        }
    }
}
