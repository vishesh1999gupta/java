package min;

import java.util.Scanner;

public class arithmeticoperation {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        String str=equation(arr,1,arr[0],""+arr[0]);
        System.out.println(str);
    }

    private static String equation(int[] arr, int i, long sum,String str) {
        if(i==arr.length && sum%101==0){
           return str;
        }
        if(i==arr.length){
            return "$";
        }
        if(sum%101==0){
            for(int p=i;p<arr.length;p++){
                str=str+"*"+arr[p];
            }
            return str;
        }
        //+
       long calc=sum+arr[i];
        String summ=equation(arr,i+1,calc,str+"+"+arr[i]);
        if(!summ.equals("$"))
            return summ;
        // -
        calc=sum-arr[i];
        String sub=equation(arr,i+1,calc,str+"-"+arr[i]);
        if(!sub.equals("$"))
            return sub;
        // *
         calc=sum*arr[i];
        String mult=equation(arr,i+1,calc,str+"*"+arr[i]);

        if(!mult.equals("$"))
            return mult;


        return "$";


    }
}
