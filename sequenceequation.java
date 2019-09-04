package min;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class sequenceequation {
    public static void main(String[] args) {
        Scanner scn = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int n=scn.nextInt();
        int[] arr=new int[n+1];
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=1;i<=n;i++){
            arr[i]=scn.nextInt();
            map.put(arr[i],i);
        }

        for(int i=1;i<=n;i++){
          int k= map.get(i);
            System.out.println(map.get(k));
        }
    }
}
