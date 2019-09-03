package min;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class bonappetit {
    public static void main(String[] args) {
        Scanner scn=new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int n=scn.nextInt();
        int k=scn.nextInt();
        int[] arr=new int[n];
        int sum=0;
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
            sum+=arr[i];
        }
        int b=scn.nextInt();
        int ans=(sum-arr[k])/2;
        if(ans==b){
            System.out.println("Bon Appetit");
        }
        else System.out.println(Math.abs(ans-b));
    }
}
