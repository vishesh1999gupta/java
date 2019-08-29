package L2june7;

import java.util.Scanner;

public class pattern13 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int nsp = n - 1;
		int nst = n;
		int row = 1;
		while (row <= 2 * n - 1) {
			int csp = 1;
			while (csp <= nsp) {
				System.out.print(" ");
				csp++;
			}
			int cst = 1;
			while (cst <= nst) {
				System.out.print("*");
				cst++;
			}
			if (row <= n - 1) {
				nsp = nsp - 1;
				nst = nst - 1;
			} else {
				nsp = nsp + 1;
				nst = nst + 1;
			}
			System.out.println();
			row++;
		}

	}

}
