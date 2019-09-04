package min;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class drawingbook {
    public static void main(String[] args) {
        Scanner scn=new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int n=scn.nextInt();
        int p=scn.nextInt();
        int  minf=0;
        int minb=0;
        minf=p/2;
        if(n%2==0){
            minb=((n-p)+1)/2;
        }
        else minb=(n-p)/2;
        System.out.println(Math.min(minf,minb));
    }
}
