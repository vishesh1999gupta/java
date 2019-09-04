package min;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class electronicsshop {
    public static void main(String[] args) {
        Scanner scn=new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int b=scn.nextInt();
        int n=scn.nextInt();
        int m=scn.nextInt();
        int[] key=new int[n];
        int[] mouse=new int[m];
        for(int i=0;i<n;i++){
            key[i]=scn.nextInt();
        }
        for(int i=0;i<m;i++){
            mouse[i]=scn.nextInt();
        }
        Arrays.sort(key);
        Arrays.sort(mouse);

        int p1=key.length-1;
        int p2=0;
        int max=0;
        while(p1>=0 && p2<mouse.length){
            int sum=key[p1]+mouse[p2];

            if(sum>b){
                p1--;
            }
            else {
                if(sum>max){
                    max=sum;
                }
                p2++;
            }

        }
        if(max==0){
            System.out.println(-1);
        }
        else System.out.println(max);
    }
}
