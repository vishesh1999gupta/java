package min;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class dayoftheprogrammer {
    public static void main(String[] args) {
        Scanner scn = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int n = scn.nextInt();
        if(n==1918){
            System.out.println("26.09.1918");
        }
       else if (n < 1918) {
            if (n % 4 == 0) {
                System.out.println("12.09." + n);
            } else System.out.println("13.09." + n);
        } else {
            if (n % 400 == 0 || (n % 4 == 0 && n % 100 != 0)) {
                System.out.println("12.09." + n);
            } else System.out.println("13.09." + n);
        }
    }
}

