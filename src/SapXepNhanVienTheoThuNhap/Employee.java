package SapXepNhanVienTheoThuNhap;

public class Employee implements Comparable<Employee> {
    private String mnv, name,position;
    private int mainSalary;
    public Employee(int n,String name,String position,int bsSalary,int wday) {
        this.mnv = "NV"+ String.format("%02d",n);
        this.name = name;
        this.position = position;
        this.mainSalary = bsSalary*wday;
    }
    public int allowance(){
        if(this.position.equals("GD")) return 500;
        if(this.position.equals("PGD")) return 400;
        if(this.position.equals("TP")) return 300;
        if(this.position.equals("KT")) return 250;
        return 100;
    }
    private int salary(){
        return this.mainSalary+allowance();
    }
    public int advance(){
        float tmp =(float) (allowance()+this.mainSalary)*2/3;
        if(tmp<25000){
            return Math.round( tmp / 1000) *1000;
        }
        return 25000;
    }
    public int rest(){
        return this.mainSalary+allowance()-advance();
    }
    public String toString(){
        return mnv+" "+ name+" " + allowance()+" "+mainSalary+" "+advance()+" "+rest();
    }

    @Override
    public int compareTo(Employee o) {
        if(this.salary()>o.salary()) return -1;
        else if(this.salary()<o.salary()) return 1;
        return 0;
    }
}
