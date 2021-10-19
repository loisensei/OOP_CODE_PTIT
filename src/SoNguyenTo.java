
import java.util.Scanner;
import static java.lang.Math.sqrt;

public class SoNguyenTo {
    boolean check(long n){
        if(n<2) return false;
        for(int i=2;i<=sqrt(n);i++){
            if(n%i==0) return false;
        }
        return true;
    }

    public static void main(String[] args){

        Scanner ip = new Scanner(System.in);
        int t= ip.nextInt();
        while(t!=0) {
            long n = ip.nextLong();
            SoNguyenTo kt = new SoNguyenTo();
            if (kt.check(n)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            t--;
        }
    }

}
