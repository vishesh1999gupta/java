package min;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Scanner;

public class matrix {
    public static void main(String[] args) {
        Scanner s = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int sum1=0;
        int sum2=0;
        int n=s.nextInt();
        int[][] arr=new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++){
                arr[i][j]=s.nextInt();
                if(i==j){
                    sum1=sum1+arr[i][j];

                }
                if(i==n-j-1){
                    sum2=sum2+arr[i][j];

                }
            }
        }
        System.out.println(Math.abs(sum2-sum1));
    }
}
