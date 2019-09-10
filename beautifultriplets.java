package min;

import java.util.Scanner;

public class beautifultriplets {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int d=scn.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=scn.nextInt();
        int count=calc(arr,d);
        System.out.println(count);
    }

    private static int calc(int[] arr, int d) {
        int p1=0;
        int p2=1;
        int count=0;
        for(int i=0;i<arr.length-2;i++){
            for(int j=i+1;j<arr.length-1;j++){
                if(arr[j]-arr[i]==d){
                    int r=calcs(arr,d,j);
                    count+=r;
                }
            }
        }
       return count;
    }

    private static int calcs(int[] arr, int d, int p3) {
        int count=0;
       for(int i=p3+1;i<arr.length;i++){
           if(arr[i]-arr[p3]==d){
               count++;
           }
           if(arr[i]-arr[p3]>d){
               break;
           }

       }


        return count;
    }
}
