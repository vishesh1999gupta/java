package min;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class sockmerchant {
    public static void main(String[] args) {
        Scanner scn=new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int n=scn.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        int count=0;
        HashMap<Integer,Boolean> map=new HashMap<>();
        for(int i=0;i<n;i++){
            if(map.containsKey(arr[i])){
                if(map.get(arr[i])==false)
                    count++;
                map.put(arr[i],!map.get(arr[i]));
            }
            else map.put(arr[i],false);
        }



        System.out.println(count);
    }

}
