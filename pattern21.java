package L2june7;

import java.util.Scanner;

public class pattern21 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int row=1;
		int nst=1;
		
		while(row<=n)
		{
			int cst=1;
			while(cst<=2*n-1)
			{
				if(cst<=row || cst>=(2*n)-row)
					System.out.print("*");
				else
					System.out.print(" ");
				cst++;
			}
			System.out.println();
			row++;
			nst++;
		}

	}

}
