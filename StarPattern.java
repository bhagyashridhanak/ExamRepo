package study;

import java.util.Scanner;

public class StarPattern {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
	
		
		System.out.println("enter the number:\n");
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			
			for(int k=n;k>=1;k--)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		for(int i=1;i<=n;i++)
		{
			
			for(int j=n-1;j>=i;j--)
			{
				System.out.print(" ");
			}
			
			for(int k=n;k>=1;k--)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		

	}

}
