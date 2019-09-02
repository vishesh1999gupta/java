package min;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class divisiblesumpairs {
    public static void main(String[] args) {
        Scanner scn=new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int n=scn.nextInt();
        int k=scn.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        System.out.println(divisiblepairs(k,arr));
    }

    private static int divisiblepairs(int k, int[] arr) {
       int count=0;
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if((arr[i]+arr[j])%k==0){
                    count++;
                }
            }
        }
        return count;
    }
}
