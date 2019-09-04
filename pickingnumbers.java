package min;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class pickingnumbers {
    public static void main(String[] args) {
        Scanner scn = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int n=scn.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);

            }
            else map.put(arr[i],1);
        }
        int max=0;

        ArrayList<Integer> ans=new ArrayList<>(map.keySet());
       for(int i:map.keySet()){
           if(map.get(i)>max){
               max=map.get(i);
           }
       }
        Collections.sort(ans);

        int p2=1;
        for(int p1=0;p1<ans.size()-1;p1++){
            if(ans.get(p2)-ans.get(p1)<=1){
                if(map.get(ans.get(p2))+map.get(ans.get(p1))>max){
                    max=map.get(ans.get(p2))+map.get(ans.get(p1));
                }
            }
            p2++;
        }
        System.out.println(max);
    }
}
