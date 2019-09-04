package min;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class beautifuldays {
    public static void main(String[] args) {
        Scanner scn = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int i=scn.nextInt();
        int j=scn.nextInt();
        int k=scn.nextInt();
        int count=0;
        for(int p=i;p<=j;p++){
            int q=rev(p);
            if(Math.abs(p-q)%k==0)
                count++;
        }

        System.out.println(count);
    }
    public static int rev(int p){
        int rev=0;
        while(p>0){
            int rem=p%10;
            rev=rev*10+rem;
            p=p/10;
        }
        return rev;
    }
}
