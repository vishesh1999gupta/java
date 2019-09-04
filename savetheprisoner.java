package min;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class savetheprisoner {
    public static void main(String[] args) {
        Scanner scn = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int t=scn.nextInt();
        while(t>0){
            int n=scn.nextInt();
            int m=scn.nextInt();
            int s=scn.nextInt();
            m=m%n;
            int ans=(s+m-1)%n;
            if(ans==0){
                System.out.println(n);
            }
            else System.out.println(ans);
            t--;
        }
    }
}
