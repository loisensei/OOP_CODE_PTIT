package File.HieuHaiTapTu;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class WordSet {
    private String path;
    private List<String> list;

    public WordSet(String path) throws FileNotFoundException {
        this.path = path;
        this.list = edit();
    }
    public List<String> edit() throws FileNotFoundException {
        List<String> list = new ArrayList<String>();
        Scanner cin = new Scanner(new File(this.path));
        while(cin.hasNext()){
            String n = cin.next().toLowerCase();
            if(!list.contains(n)){
                list.add(n);
            }
        }
        Collections.sort(list);
        return list;
    }
    public List<String> getList(){
        return this.list;
    }
    public String difference(WordSet s1) {
        String s = "";
        List<String> tmp = new ArrayList<String>();
        for(String i : this.list){
            if(!s1.getList().contains(i)){
                tmp.add(i);
            }
        }
        Collections.sort(tmp);
        for(String i : tmp){
            s+=i+" ";
        }
        return s;
    }
}
