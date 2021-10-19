package DanhSachThucTap2;

public class Businesses implements Comparable<Businesses>{
    private int stt;
    private String msv,name,grade,email,nameBusiness;
    public Businesses(int stt, String msv, String name, String grade, String email,String nameBusiness){
        this.stt = stt;
        this.msv = msv;
        this.name = name;
        this.grade = grade;
        this.email = email;
        this.nameBusiness = nameBusiness;
    }
    public String toString() {
        return stt + " " + msv + " "+ name +" "+ grade +" "+ email +" "+ nameBusiness;
    }
    public String getNameBusiness(){
        return this.nameBusiness;
    }
    @Override
    public int compareTo(Businesses o) {
        if(this.msv.compareTo(o.msv)>0) return 1;
        else if(this.msv.compareTo(o.msv)<0) return -1;
        return 0;
    }
}
