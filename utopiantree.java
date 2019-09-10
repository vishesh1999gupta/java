package min;

import java.util.Scanner;

public class utopiantree {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int t=scn.nextInt();
        while(t>0){
            int n=scn.nextInt();
            int h=1;
            for(int i=1;i<=n;i++){
                if(i%2==0){
                    h+=1;
                }
                else h*=2;
            }
            System.out.println(h);
            t--;
        }
    }
}
