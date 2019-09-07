package assignment;

import java.util.Scanner;

public class diamond {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int nst = 1;
		int nsp = n / 2;
		int row = 1;
		while (row <= n) {
			int csp = 1;
			while (csp <= nsp) {
				System.out.print(" ");
				csp++;
			}
			int cst = 1;
			while (cst <= nst) {
				if(cst%2==0)
					System.out.print(" ");
				else
				System.out.print("*");
				cst++;
			}
			System.out.println();
			if (row <= n / 2) {
				nst = nst + 2;
				nsp--;
			} else {
				nst = nst - 2;
				nsp++;
			}
			row++;
		}

	}

}
