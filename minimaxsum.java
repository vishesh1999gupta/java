package min;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class minimaxsum {
    public static void main(String[] args) {

        Scanner scn=new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        Long[] arr = new Long[5];
        Long max=Long.MIN_VALUE;
        Long min=Long.MAX_VALUE;
        Long sum= 0l;
        for (int i = 0; i < 5; i++) {
            arr[i]=scn.nextLong();
            sum+=arr[i];
        }
        for(int i=0;i<5;i++){
            Long f=sum-arr[i];
            if(f>max){
                max=f;
            }
            if(f<min){
                min=f;
            }
        }
        System.out.println(min+" "+max);
    }
}