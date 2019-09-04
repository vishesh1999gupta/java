package min;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class circulararray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int n=scn.nextInt();
        int k=scn.nextInt();
        int q=scn.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        k=k%q;
        for(int i=0;i<k;i++){

        }
    }
}
