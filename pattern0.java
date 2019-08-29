package L2june7;

import java.util.Scanner;

public class pattern0 {

	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		int n = scn.nextInt();
		int nst=n;
		int nsp=0;
		int row=1;
		while(row<=n)
		{
			int csp=1;
			while(csp<=nsp)
			{
				System.out.print(" ");
                csp++;
			}
			int cst=1;
			while(cst<=nst)
			{
				System.out.print("*");
				cst++;
			}
			System.out.println();
			row++;
			nst--;
			nsp=nsp+2;
			
		}

	}

}
