package min;

import java.util.HashMap;
import java.util.Scanner;

public class designerpdfviewer {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<26;i++){
            map.put((char)(i+97),scn.nextInt());
        }
        String str=scn.next();
        int max=0;
        int p=0;
//        System.out.println(map);
        for(int i=0;i<str.length();i++){
             p=map.get(str.charAt(i));
            if(p>max){
                max=p;
            }
        }
        System.out.println(max*str.length());
    }
}
