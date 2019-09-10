package min;

import java.util.Scanner;

public class angryprofessor {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int t=scn.nextInt();

        while(t>0){
            int count=0;
            int n=scn.nextInt();
            int k=scn.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=scn.nextInt();
                if(arr[i]<=0){
                    count++;
                }
            }
            if(count<k){
                System.out.println("YES");
            }
            else System.out.println("NO");
            t--;
        }
    }
}
