package BangDiemHocSinh;

import java.util.ArrayList;

public class Transcript implements Comparable<Transcript> {
    private String msv,studentName;
    private ArrayList<Double> listPoints;
    private double gpa;
    public Transcript(int n,String studentName, ArrayList<Double> listPoints) {
        this.msv = "HS"+String.format("%02d",n);
        this.studentName = studentName;
        this.listPoints = listPoints;
        this.gpa = gpa();
    }



    public Transcript(int n) {
        this.msv = "HS"+String.format("%02d",n);
    }

    public void setStudentName(String name){
        this.studentName = name;
    }
    public void setListPoints(ArrayList<Double> listPoints){
        this.listPoints = listPoints;
        this.gpa =(double) Math.round(gpa()*10)/10 ;
    }
    private  double gpa(){
        double tmp=0;
        for(int i=0;i<=9;i++){
            if(i<2){
                tmp+=this.listPoints.get(i)*2;
            }else{
                tmp+=this.listPoints.get(i);
            }
        }
        tmp/=12;
        return tmp;
    }
    public String classification(){
        if(gpa>=9) return "XUAT SAC";
        else if(gpa>=8) return "GIOI";
        else if(gpa>=7) return "KHA";
        else if(gpa>=5) return "TB";
        else return "YEU";
    }
    public String toString(){
        return msv+" "+studentName+" "+String.format("%.1f",gpa)+" "+classification();
    }

    @Override
    public int compareTo(Transcript o) {
        if(this.gpa>o.gpa) return -1;
        else if(this.gpa<o.gpa) return 1;
        return 0;
    }
}
