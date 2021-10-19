import java.math.BigInteger;
import java.util.Scanner;

public class BoiSoChungNhoNhat {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int t = cin.nextInt();
        while(t-->0){
            BigInteger a = new BigInteger(cin.next());
            BigInteger b = new BigInteger(cin.next());
            System.out.println(a.multiply(b).divide(a.gcd(b)));
        }
    }
}
