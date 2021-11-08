package File.DanhSachSinhVienTrongFileVanBan;


import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException, ParseException {
        File file = new File("SV.in");
        Scanner cin = new Scanner(file);
        List<Student> list = new ArrayList<Student>();
        int n = cin.nextInt();
        cin.nextLine();
        for(int i= 1; i<=n ; i++){
            Student student = new Student(i,cin.nextLine(),cin.nextLine(),cin.nextLine(),Double.parseDouble(cin.nextLine()));
            list.add(student);
        }
        for(Student student : list){
            System.out.println(student);
        }
    }
}
