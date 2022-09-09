package com.user.pack;

import java.util.Scanner;

public class Statement
{
	 
   public static void main(String[] args) 
   {
	   Scanner sc= new Scanner(System.in);
	int n;
	System.out.println(" Enter number");
	n=sc.nextInt();
	if(n==0)
	{
		System.out.println( " number is zero");
		
	}
	else if(n%2==0)
	{
		System.out.println(" number is even ");
	}
	else {
		System.out.println("  odd");
	}
//	System.out.println(7%9);
}
}
