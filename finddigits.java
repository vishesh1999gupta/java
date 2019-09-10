package min;

import java.util.Scanner;

public class finddigits {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int t=scn.nextInt();
        while(t>0){
            int count=0;
            int n=scn.nextInt();
            int p=n;
            while(p>0){
                int rem=p%10;
                if(rem!=0) {
                    if (n % rem == 0) {
                        count++;
                    }
                }
                p=p/10;
            }
            System.out.println(count);
            t--;
        }
    }
}
