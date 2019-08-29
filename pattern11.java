package L2june7;

import java.util.Scanner;

public class pattern11 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int nsp = n - 1;
		int nst = 1;
		int row = 1;
		while (row <= n) {
			int csp = 1;
			while (csp <= nsp) {
				System.out.print(" ");
				csp++;
			}
			int cst = 1;
			while (cst <= nst) {
				if (cst % 2 == 0)
					System.out.print(" ");
				else
					System.out.print("*");
				cst++;
			}
			row++;
			nst = nst + 2;
			nsp = nsp - 1;
			System.out.println();
		}

	}

}
