package min;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class breakingtherecords {
    public static void main(String[] args) {
        Scanner scn=new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int n=scn.nextInt();
        int[] scores=new int[n];
        for(int p=0;p<scores.length;p++){
            scores[p]=scn.nextInt();
        }

        int[] ans=record(scores);
       for(int i=0;i<ans.length;i++){

           System.out.print(ans[i]+" ");
       }
    }

    private static int[] record(int[] scores) {
        int[] ans=new int[2];
        int min=scores[0];
        int max=scores[0];
        for(int i=1;i<scores.length;i++){

            if(scores[i]>max){
                max=scores[i];
                ans[0]++;
            }
            if(scores[i]<min){
                min=scores[i];
                ans[1]++;
            }
        }
        return ans;
    }
}
