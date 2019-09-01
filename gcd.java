package min;

import java.util.ArrayList;
import java.util.List;

public class gcd {
    public static void main(String[] args) {
        System.out.println(gcd(24,36));

    }

    private static int gcd(int i, int i1) {
        if(i1==0){
            return i;
        }
        int temp=i1;
        i1=i%i1;
        i=temp;
        return gcd(i,i1);
    }
}
