package TimKiemGiangVien;

public class GiangVien implements Comparable<GiangVien> {
    private String mgv,name,subject;
    public GiangVien(int n,String name,String subject){
        this.mgv = "GV"+ String.format("%02d",n);
        this.name = name;
        this.subject = formatSubject(subject);
    }

    public GiangVien() {
    }
    public String getSubject(){
        return this.subject;
    }
    public String formatSubject(String o){
        String[] a = o.split(" ");
        String s = "";
        for (String i : a){
            s += String.valueOf(i.charAt(0)).toUpperCase();
        }
        return s;
    }
    public boolean checkStringToken(String s){
        return this.name.toLowerCase().contains(s.toLowerCase());
    }
    public String toString(){
        return mgv +" "+ name +" "+ subject;
    }

    private String lastName() {
        String[] s = this.name.split(" ");
        return s[s.length - 1];
    }
    @Override
    public int compareTo(GiangVien o) {
        if(this.lastName().compareTo(o.lastName())>0) return 1;
        else if(this.lastName().compareTo(o.lastName())<0) return -1;
        return 0;
    }
}
