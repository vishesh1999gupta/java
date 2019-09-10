package min;

import java.util.Scanner;

public class leftrotation {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int d=scn.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        d=n-(d%n);
        for(int i=0;i<d;i++){
            rot(arr);
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }

    private static void rot(int[] arr) {
        int n=arr[arr.length-1];

        for(int i=arr.length-1;i>0;i--){

            arr[i]=arr[i-1];
        }
        arr[0]=n;
    }
}
