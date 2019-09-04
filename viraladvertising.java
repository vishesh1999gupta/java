package min;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class viraladvertising {
    public static void main(String[] args) {
        Scanner scn = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int n=scn.nextInt();
        int like=0;
        int d=5;
        while(n>0){
            d=d/2;
            like+=d;
            d=d*3;
            n--;

        }
        System.out.println(like);
    }
}
