package BangDiemTP2;

public class Transcript implements Comparable<Transcript>{
    private String msv,name,grade;
    private Double point1,point2,point3;
    public Transcript(String msv,String name,String grade,Double point1,Double point2,Double point3){
        this.msv = msv;
        this.name = name;
        this.grade = grade;
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
    }
    public String toString(){
        return msv + " " + name + " "+ grade + String.format(" %.1f",point1)+String.format(" %.1f",point2)+String.format(" %.1f",point3);
    }

    @Override
    public int compareTo(Transcript o) {
        if(this.name.compareTo(o.name)>0) return 1;
        else if(this.name.compareTo(o.name)<0) return -1;
        return 0;
    }
}
