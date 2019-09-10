package min;

import java.util.HashMap;
import java.util.Scanner;

public class climbingtheleaderboard {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[] l=new int[n];
        int count=1;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            l[i]=scn.nextInt();
            if(!map.containsKey(l[i])){
                map.put(l[i],count);
                count++;
            }
        }

        int g=scn.nextInt();
        int[] r=new int[g];
        for(int i=0;i<g;i++){
            r[i]=scn.nextInt();
        }


        for(int i=0;i<g;i++){
            if(r[i]>l[0]){
                System.out.println("1");
            }
            else if(r[i]<l[l.length-1]){
                System.out.println(count);
            }
            else if(map.containsKey(r[i])){
                System.out.println(map.get(r[i]));
            }
            else {
                int end=l.length-1;
                int start=1;
                while(start<=end){
                    int mid=(start+end)/2;
                    if(r[i]>l[mid]){
                        end=mid-1;
                    }
                    else start=mid+1;
                    if(r[i]>l[mid] && r[i]<l[mid-1]){
                        System.out.println(map.get(l[mid]));
                    }
                }
            }
        }
    }
}
