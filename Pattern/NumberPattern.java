package Pattern;

import java.util.Scanner;

public class NumberPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number ");
		int n=sc.nextInt();
		for(int i=0;i<=n;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("1");
				System.out.print("");
			}
			
			System.out.println();
		}
		
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter Number ");
		int num=sc1.nextInt();
		for(int i=num;i>0;i--)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print("1");
				System.out.print("");
			}
			
			System.out.println();
		}
		
		Scanner sc2=new Scanner(System.in);
		System.out.println("Enter Number ");
		int row=sc2.nextInt();
		for(int i=1; i<=row; i++)
		{
			for(int j=i; j<row; j++)
			{
				System.out.print(" ");
			}
			for(int k=0;k<=(2*i-1);k++)
			{
				System.out.print("1");
				System.out.print("");
			}
			System.out.println();
		}
		
		

	}

}
