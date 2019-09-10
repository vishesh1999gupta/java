package min;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class cutthestciks {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        while (n > 0) {
            arr.add(scn.nextInt());
            n--;
        }
//        System.out.println();
        Collections.sort(arr);
//        System.out.println(arr);
        while (arr.size() != 0) {
            ans.add(arr.size());
            int a = arr.get(0);
            for (int i = 0; i < arr.size(); i++) {
//                System.out.println(arr.get(i));
                if (arr.get(i) - a == 0) {
//                    System.out.println("yay");
                    arr.remove(i);
                    i--;
                } else {
                    arr.set(i, arr.get(i) - a);
                }
            }
//            System.out.println(arr);
        }
        for (int i = 0; i < ans.size(); i++)
            System.out.println(ans.get(i));
    }
}
