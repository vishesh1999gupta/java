package min;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class catsandamouse {
    public static void main(String[] args) {
        Scanner scn = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int q = scn.nextInt();
        for (int i = 0; i < q; i++) {
            int c1 = scn.nextInt();
            int c2 = scn.nextInt();
            int m1 = scn.nextInt();
            int d1 = Math.abs(m1 - c1);
            int d2 = Math.abs(c2 - m1);
            if (d1 < d2) {
                System.out.println("Cat A");
            } else if (d1 > d2) {
                System.out.println("Cat B");
            } else System.out.println("Mouse C");
        }
    }
}
