package min;

import java.math.BigInteger;
import java.util.Scanner;

public class extralongfactorial {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        System.out.println(fact(n));
    }

    private static BigInteger fact(int n) {
        if(n==0){
            return BigInteger.ONE;
        }
        BigInteger p= fact(n-1);
        return p.multiply(BigInteger.valueOf(n));
    }
}
