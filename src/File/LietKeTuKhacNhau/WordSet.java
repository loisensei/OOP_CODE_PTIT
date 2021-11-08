package File.LietKeTuKhacNhau;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class WordSet implements Serializable {
    private String path;
    private List<String> listWords;
    public WordSet(String path) throws FileNotFoundException {
        this.path = path;
        this.listWords = edit();
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

    @Override
    public String toString() {
        String s ="";
        for(String i : listWords){
            s+=i+"\n";
        }
        return s;
    }
}
