package DanhSachDoanhNghiepNhanSVThucTap1;

public class Enterprise implements Comparable<Enterprise>{
    private String mdn,name;
    private int quantity;
    public Enterprise(String mdn, String name, int quantity){
        this.mdn = mdn;
        this.name = name;
        this.quantity = quantity;
    }

    public String toString(){
        return mdn+" "+ name +" " + quantity;
    }
    public int getQuantity(){
        return this.quantity;
    }

    @Override
    public int compareTo(Enterprise o) {
        if(this.quantity > o.quantity) return -1;
        else if(this.quantity < o.quantity) return 1;
        return compareMDNTo(o);
    }
    public int compareMDNTo(Enterprise o) {
        if(this.mdn.compareTo(o.mdn)>0) return 1;
        else if(this.mdn.compareTo(o.mdn)<0) return -1;
        return 0;
    }
}
