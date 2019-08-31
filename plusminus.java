package min;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.Scanner;

public class plusminus {
    public static void main(String[] args) {
        Scanner scn=new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int n=scn.nextInt();
        int[] arr=new int[n];
        int p=0;
        int neg=0;
        int z=0;

        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
            if(arr[i]<0)
                neg++;
            else if(arr[i]>0)
                p++;
            else z++;
        }
        DecimalFormat df = new DecimalFormat("0.000000");
        System.out.println(df.format((float)p/n));
        System.out.println(df.format((float)neg/n));
        System.out.println(df.format((float)z/n));
    }
}
