package min;

import java.util.Scanner;

public class gridlandmetro {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int r=scn.nextInt();
        int c=scn.nextInt();
        int t=scn.nextInt();
        long sum=0;
        for(int i=0;i<t;i++){
            int h=scn.nextInt();
            int k=scn.nextInt();
            int p=scn.nextInt();
            sum+=p-k+1;
        }
        System.out.println((r*c)-sum);
    }
}
