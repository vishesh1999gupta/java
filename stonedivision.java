package min;


import java.util.ArrayList;

import java.util.Collections;
import java.util.Scanner;

public class stonedivision {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int q=scn.nextInt();
        while(q>0){
            long n=scn.nextLong();
            int m=scn.nextInt();
            ArrayList<Long> arr=new ArrayList<>();
            for(int i=0;i<m;i++){
                 long t=scn.nextLong();
            if(n%t==0 && t<n && !arr.contains(t))
                    arr.add(t);
            }
            Collections.sort(arr);
            int l=arr.size()-1;
//            System.out.println(arr);

//            System.out.println(arr.get(l)!=n);
            long moves=steps(n,1L,arr,0L,l);
            System.out.println(moves);
            q--;
        }
    }

    private static long steps(long n, long np,ArrayList<Long> arr, long i,int l) {
//        System.out.println(n+"  "+np+" "+i+" "+l);
        if(n==1 || l==-1){

            return i;
        }
//        int flag=0;
        long max=Long.MIN_VALUE;
          for(int j=l;j>=0;j--){
              long count=Long.MIN_VALUE;
//              System.out.println(arr.get(j)!=n);
              if(n%arr.get(j)==0 && arr.get(j)!=n) {
//                  System.out.println("yay");
                  count = steps(arr.get(j), (n / arr.get(j))*np, arr, i+np, j-1);
                  if(count>max)
                      max=count;
              }

          }

          if(max!=Integer.MIN_VALUE)
          return max;
          else return i;


    }
}
