package L2june7;

import java.util.Scanner;

public class pattern {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("enter the odd number ");
		int n = scn.nextInt();
		int p=n;
		int t;
		int r;
		int m;
		int z=1;
			t=n;
			int f=n-2;
			int k=2;
			int g=1;
			while(t>0)
			{
				System.out.print("*");
				t--;
			}
			System.out.println();
			while(f>0)
			{
			 r=(n-z)/2;
		    	
		    while(r>0)
		    {
		    	System.out.print("*");
		    	r--;
		    }
		    r=(n-z)/2;
		    m=g;
		    while(m>0)
		    {
		    System.out.print(" ");
		    m--;
		    }
		    while(r>0)
		    {
		    	System.out.print("*");
		    	r--;
		    }
		    System.out.println();
		    g=g+2;
		     z=z+2;
		     f=f-2;
			}
			z=z-4;
			g=n-4;
			f=4;
			while(f<n)
			{
				r=(n-z)/2;
				while(r>0)
				{
					System.out.print("*");
	                r--;			
				}
				r=(n-z)/2;
				m=g;
				while(m>0)
				{
					System.out.print(" ");
					m--;
				}
				g=g-2;
				while(r>0)
				{
					System.out.print("*");
					r--;
				}
				z=z-2;
				System.out.println();
				f=f+2;
				
			}
			while(n>0)
			{
				System.out.print("*");
                n--;
			}
			
	}

}
