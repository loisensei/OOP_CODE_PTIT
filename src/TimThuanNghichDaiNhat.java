
import java.util.*;


public class TimThuanNghichDaiNhat {
    static boolean check(String s){
        StringBuilder tmp = new StringBuilder(s);
        return s.equals(tmp.reverse().toString());
    }

    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        Map<String, Integer> list = new LinkedHashMap<>();
        int maxSize = 0;

        while(cin.hasNext()){
            String s = cin.next();
            if (check(s)) {
                if(s.length()>maxSize) maxSize = s.length();
                if (!list.containsKey(s)) {
                    list.put(s, 0);
                }
                list.put(s, list.get(s) + 1);
            }
        }

        Set<String> keys = list.keySet();
        for(String key : keys) {
            if(key.length() == maxSize){
                System.out.println(key+" "+list.get(key));
            }
        }

    }
}
