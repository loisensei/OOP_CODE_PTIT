

import java.io.FileNotFoundException;
import java.util.*;
import java.util.stream.Collectors;

public class LietKeVaDem {
    public static boolean check(String n){
        int i = 1;
        while(i<n.length()){
            int a = Integer.parseInt(String.valueOf(n.charAt(i)));
            int b = Integer.parseInt(String.valueOf(n.charAt(i-1)));
            if(a<b) return false;
            i++;
        }
        return true;
    }
    public static void main(String[] args)  {
        Scanner cin = new Scanner(System.in);
        Map<Integer,Integer> ds = new LinkedHashMap<>();
        while(cin.hasNext()){
            Integer n = cin.nextInt();
            if (check(String.valueOf(n))) {
                if (!ds.containsKey(n)) {
                    ds.put(n, 0);
                }
                ds.put(n, ds.get(n) + 1);
            }
        }
        Map<Integer,Integer> result = ds.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue,
                        LinkedHashMap::new
                ));
        Set<Integer> keys = result.keySet();
        for(Integer key : keys) {
            System.out.println(key+" "+result.get(key));
        }
    }
}
