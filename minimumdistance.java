package min;

import java.util.HashMap;
import java.util.Scanner;

public class minimumdistance {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[] arr=new int[n];
        int min=Integer.MAX_VALUE;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
            if(map.containsKey(arr[i])){
                int m=i-map.get(arr[i]);
                if(m<min){
                    min=m;
                }
            }
            else map.put(arr[i],i);
        }
        if(min!=Integer.MAX_VALUE)
        System.out.println(min);
        else System.out.println("-1");
    }
}
