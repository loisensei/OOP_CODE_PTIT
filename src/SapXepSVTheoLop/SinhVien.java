package SapXepSVTheoLop;

public class SinhVien implements Comparable<SinhVien>{
    private String msv,name,grade,email;
    public SinhVien(String msv,String name,String grade,String email){
        this.msv = msv;
        this.name = name;
        this.grade = grade;
        this.email = email;
    }
    public String toString(){
        return msv + " "+ name +" "+grade+" "+email;
    }
//    public String getGrade(){
//        return this.grade;
//    }
//    public String getYear(){
//        return  "20"+this.grade.substring(1,3);
//    }
    public String getMajor(){
        String tmp = this.msv.substring(3,7);
        if (this.grade.charAt(0) != 'E') {
            if (tmp.compareTo("DCCN") == 0) return "Cong nghe thong tin";
            else if (tmp.compareTo("DCAT") == 0) return "An toan thong tin";
        }
        if(tmp.compareTo("DCKT")==0) return "Ke toan";
        else if(tmp.compareTo("DCVT")==0) return "Vien thong";
        else return "Dien tu";
    }
    @Override
    public int compareTo(SinhVien o) {

        if(this.grade.compareTo(o.grade)>0) return 1;
        else if(this.grade.compareTo(o.grade)<0) return -1;
        return compareMSV(o);
    }
    public int compareMSV(SinhVien o){
        if(this.msv.compareTo(o.msv)>0) return 1;
        else if(this.msv.compareTo(o.msv)<0) return -1;
        return 0;
    }
}
