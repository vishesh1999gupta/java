package min;

import java.util.Scanner;

public class halloweensale {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int p=scn.nextInt();
        int d=scn.nextInt();
        int m=scn.nextInt();
        int s=scn.nextInt();
        int count=0;
        while(s-p>=0){
            s=s-p;
            if(p-d>=m){
                p=p-d;
            }
            else p=m;
            count++;
        }
        System.out.println(count);
    }
}
