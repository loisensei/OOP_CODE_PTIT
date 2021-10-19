package TinhThuNhapGiaoVien;

public class Teacher {
    private String mgv,name;
    private int basicSalary,hs;
    public Teacher(String mgv,String name,int basicSalary){
        this.mgv = mgv;
        this.name = name;
        this.basicSalary = basicSalary;
        this.hs = getHS();
    }
    public int allowances(){
        String o = this.mgv.substring(0,2);
        if(o.equals("HT")) return 2000000;
        else if(o.equals("HP")) return 900000;
        return 500000;
    }
    private int getHS(){
        String tmp = this.mgv.substring(2);
        return Integer.parseInt(tmp);
    }
    public int salary(){
        return basicSalary*hs+allowances();
    }
    public String toString(){
        return mgv +" "+ name +" " + hs +" "+ allowances()+" "+salary();
    }
}
