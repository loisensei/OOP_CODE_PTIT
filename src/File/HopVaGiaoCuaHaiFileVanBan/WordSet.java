package File.HopVaGiaoCuaHaiFileVanBan;

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
        List<String> lists = new ArrayList<>();
        Scanner cin = new Scanner(new File(this.path));
        while(cin.hasNext()){
            String n = cin.next().toLowerCase();
            if(!lists.contains(n)){
                lists.add(n);
            }
        }
        Collections.sort(lists);
        return lists;
    }
    public List<String> getList(){
        return this.list;
    }
    public String union(WordSet wordSet){
        String s = "";
        List<String> tmp = new ArrayList<String>();
        for(String i : this.list){
            if(!tmp.contains(i)){
                tmp.add(i);
            }
        }
        for(String i : wordSet.getList()){
            if(!tmp.contains(i)){
                tmp.add(i);
            }
        }
        Collections.sort(tmp);
        for(String i : tmp){
            s+=i+' ';
        }
        return s;
    }
    public String intersection(WordSet wordSet){
        String s ="";
        List<String> tmp = new ArrayList<>();
        for(String i : this.list){
            if(wordSet.getList().contains(i)){
                tmp.add(i);
            }
        }
        Collections.sort(tmp);
        for(String i : tmp){
            s+=i+' ';
        }
        return s;
    }

}
