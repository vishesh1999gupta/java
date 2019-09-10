package min;


import java.util.Scanner;

public class jumpingontheclouds {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        System.out.println(moves(arr,0,0));
    }

    private static int moves(int[] arr, int i, int moves) {
        if(i==arr.length-1){
            return moves;
        }
        int m1=Integer.MAX_VALUE;
        int m2=Integer.MAX_VALUE;
        if(i+1<arr.length && arr[i+1]!=1)
            m1=moves(arr,i+1,moves+1);
        if(i+2<arr.length && arr[i+2]!=1)
         m2=moves(arr,i+2,moves+1);
        return Math.min(m1,m2);
    }
}
