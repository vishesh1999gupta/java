package min;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class timeconversion {
    static String timeConversion(String s) {
        /*
         * Write your code here.
         */
        if(s.charAt(s.length()-2)=='P'){
            String str = s.substring(0, 2);
            int p=Integer.parseInt(str);
            p=(p%12)+12;
            str=""+p;
            str=str+s.substring(2,s.length()-2);
            return str;
        }
        else {
            String str = s.substring(0, 2);
            int p=Integer.parseInt(str);
            if(p/10==0)
            str="0"+p;
            else if(p==12)
                str="00";
                else str=""+(p%12);
            str=str+s.substring(2,s.length()-2);
            return str;
        }

    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {


        String s = scan.nextLine();

        String result = timeConversion(s);
        System.out.println(result);



    }
}
