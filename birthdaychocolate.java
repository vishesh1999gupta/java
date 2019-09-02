package min;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.lang.management.BufferPoolMXBean;
import java.util.Scanner;

public class birthdaychocolate {
    public static void main(String[] args) {
        Scanner scn=new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int n=scn.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }

        int d=scn.nextInt();
        int m=scn.nextInt();
        System.out.println(birthday(d,m,arr));
    }

    private static int birthday(int d, int m, int[] arr) {
        int count=0;
        for(int i=0;i<=arr.length-m;i++){
            int sum=0;
            for(int p=0;p<m;p++){
                sum+=arr[p+i];
            }

            if(sum==d){
                count++;
            }
        }
        return count;
    }
}
