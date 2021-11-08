package File.LietKeTuKhacNhau;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        WordSet ws = new WordSet("src/File/DATA.in");
        System.out.println(ws);
    }
}
