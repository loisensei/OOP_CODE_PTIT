package File.DanhSachSinhVienTrongFileVanBan;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Student implements Serializable {
    private String msv, name, grade;
    private Date birthDate;
    private Double gpa;
    private SimpleDateFormat SimpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

    public Student(int stt, String name,  String grade,String birthDate, Double gpa) throws ParseException {
        this.msv = "B20DCCN"+String.format("%03d",stt);
        this.name = name;
        this.grade = grade;
        this.birthDate = this.SimpleDateFormat.parse(birthDate);
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return msv+" "+ name+" "+grade+" "+ SimpleDateFormat.format(birthDate)+" "+String.format("%.2f",gpa);
    }
}
