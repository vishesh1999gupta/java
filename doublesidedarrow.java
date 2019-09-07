package assignment;

import java.util.Scanner;

public class doublesidedarrow {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int nsp1=n-1;
		int nst=1;
		int nsp2=-1;
		int row=1;
		int val1=1;
		int val2;
		while(row<=n)
		{
			int csp=1;
			while(csp<=nsp1)
			{
				System.out.print("  ");
				csp++;
			}
			int cst=1;
			while(cst<=nst)
			{
				
				System.out.print(val1+ " ");
				cst++;
				val1--;
			}
			csp=1;
			while(csp<=nsp2)
			{
				System.out.print("  ");
				csp++;
			}
			if(row==1 || row==n)
			{ }
			else
			{
				val2=1;
				cst=1;
				while(cst<=nst)
				{
					System.out.print(val2+ " ");
					cst++;
					val2=val2+1;
				}
			}
			System.out.println();
			if(row<=n/2)
			{
				nsp1=nsp1-2;
				nst=nst+1;
				nsp2=nsp2+2;
				val1=row+1;
			}
			else
				{nsp1=nsp1+2;
			nst--;
			nsp2=nsp2-2;
			val1=n-row;
				}
			row++;
				
		}

	}

}
