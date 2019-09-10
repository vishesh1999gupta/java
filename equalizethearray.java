package min;

import java.util.HashMap;
import java.util.Scanner;

public class equalizethearray {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[] arr=new int[n];
        HashMap<Integer,Integer> map=new HashMap<>();
        int max=1;
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
//            System.out.println("ya");
            if(map.containsKey(arr[i])) {
//                System.out.println("yay");
                map.put(arr[i], map.get(arr[i]) + 1);
                if (map.get(arr[i]) > max) {
                    max = map.get(arr[i]);

                }
            }
                else map.put(arr[i],1);

        }
//        System.out.println(map);
//        System.out.println(max);
        System.out.println(arr.length-max);
    }
}
