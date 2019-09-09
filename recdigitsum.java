package min;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class recdigitsum {
    public static void main(String[] args) {
        Scanner scn=new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        String n=scn.next();
        int k=scn.nextInt();
        long sum=0;

        for(int i=0;i<n.length();i++){
            String p= String.valueOf(n.charAt(i));
            sum+=Integer.parseInt(p);
        }

        sum=sum*k;
//        System.out.println(recdigit(sum));
        if(sum%9!=0) {
            System.out.println(sum % 9);
        }
            else System.out.println("9");
        }



    private static long recdigit(long sum) {
        if(sum/10==0){
            return sum;
        }
        int f=0;
        while(sum>0){
            int rem=(int)sum%10;
            sum=sum/10;
            f+=rem;
        }
        return recdigit(f);
    }
}
