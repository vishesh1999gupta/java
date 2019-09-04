package min;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class countingvalleys {
    public static void main(String[] args) {
        Scanner scn=new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int n=scn.nextInt();
        String str=scn.next();
        int level=0;
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='D'){
                level--;
                if(level==-1)
                    count++;
            }
            else level++;
        }
        System.out.println(count);
    }
}
