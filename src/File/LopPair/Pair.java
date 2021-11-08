package File.LopPair;

import static java.lang.Math.sqrt;

public class Pair<N,V> {
    private N number1;
    private V number2;

    public Pair(N number1, V number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public boolean isPrime() {
        if(check((Integer) this.number1)) return false;
        return !check((Integer) this.number2);
    }
    private boolean check(int n){
        if(n<2) return true;
        for(int i =2; i<= sqrt(n);i++){
            if(n%i==0) return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return number1 +" "+ number2;
    }
}
