package min;

import java.util.Scanner;

public class repeatedstring {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        String s=scn.next();
        long n=scn.nextLong();
        long p=s.length();
        long count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a') {
                count++;
            }
        }
        count*=n/p;
        for(long i=0;i<n%p;i++){
            if(s.charAt((int)i)=='a'){
                count++;
            }
        }
        System.out.println(count);

    }
}
