package min;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class sherlockandsquares {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        HashSet<Integer> map = new HashSet<>();
        while (t > 0) {
            int n1 = scn.nextInt();
            int n2 = scn.nextInt();
            int s1=(int)Math.sqrt(n1);
            int count=0;
            if(s1*s1==n1){
                count++;
            }
            int s2=(int) Math.sqrt(n2);
            if(s2*s2==n2){

            }
            count+=s2-s1;
            System.out.println(count);
            t--;
        }
    }
}

