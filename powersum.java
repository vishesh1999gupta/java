package min;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class powersum {
    public static void main(String[] args) {
        Scanner scn=new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int x=scn.nextInt();
        int n=scn.nextInt();
        System.out.println(count(x,n,0,1,0));
    }
    public static int count(int x,int n,int sum,int sf,int c){
//        System.out.println(sum+" "+sf+" "+c);
        if(sum==x){
           return 1;
       }
       int count=0;
        for(int p=sf;p<=x;p++){
//            System.out.println(p);
//            System.out.println(Math.pow(p,n)+sum);
            if(Math.pow(p,n)+sum<=x){

                count+= count(x,n,(int)(Math.pow(p,n)+sum),p+1,c);
            }
        }
        c=c+count;
//        System.out.println(c);
        return c;
    }
}
