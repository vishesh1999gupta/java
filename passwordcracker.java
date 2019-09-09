package min;

import java.util.HashSet;
import java.util.Scanner;

public class passwordcracker {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();

        while (t > 0) {
            HashSet<String> map = new HashSet<>();
            int n = scn.nextInt();
            for (int i = 0; i < n; i++) {
                map.add(scn.next());
            }
            String attempt = scn.next();
            System.out.println(t);
            StringBuilder str = new StringBuilder();
            StringBuilder s = new StringBuilder();
            str = cracker(map, s, attempt);
           String ans =str.toString();
            if (ans.contains("$"))
                System.out.println("WRONG PASSWORD");
            else {
                ans = ans.substring(0, ans.length() - 1);
                System.out.println(ans);
            }
            t--;
        }
    }

    private static StringBuilder cracker(HashSet<String> map, StringBuilder s, String attempt) {
        if (attempt.length() == 0) {
            return s;
        }
        StringBuilder ans = new StringBuilder();
        int flag = 0;
        for (int i = 1; i <= attempt.length(); i++) {
            String sub = attempt.substring(0, i);

            if (map.contains(sub)) {

                String ros = attempt.substring(i);
                ans = cracker(map, s.append(sub + " "), ros);
                if (ans.charAt(ans.length() - 1) != '$') {
                    flag = 1;
                    break;
                }
            }
        }
        if (flag == 0) {
            ans = new StringBuilder("$");
        }
        return ans;
    }
}
