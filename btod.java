package L2june7;

import java.util.Scanner;

public class btod {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int ans = 0;
		int rem;
		int p = 1;
		while (n != 0) {
			rem = n % 10;
			ans = ans + (rem * p);
			p = 2 * p;
			n = n / 10;
		}
		System.out.println(ans);
	}

}
