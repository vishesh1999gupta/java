package min;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class migratorybirds {
    public static void main(String[] args) {
        Scanner scn=new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int n=scn.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        Arrays.sort(arr);
        int freq=0;
        int max=arr[0];
        int t=arr[0];
        int count=0;
        for(int i=0;i<arr.length;i++){

            if(count>freq){
                freq=count;
                max=t;

            }
            if(arr[i]==t){
                count++;
            }
            else{


                t=arr[i];
                count=1;
            }
        }
        System.out.println(max);
    }
}
