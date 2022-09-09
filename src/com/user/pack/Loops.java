package com.user.pack;

import java.util.Scanner;

public class Loops 
{
 public static void main(String[] args) 
 {
	 System.out.println(" Divisible by 3");
	for(int i=20;i<40;i++)	
	{
		if(i%3==0)
		{
			System.out.println(i);}
		}
	System.out.println("Divisible by 4");
	for(int i=20;i<=40;i++)	
	{
		if(i%4==0)
		{
			System.out.println(i);
		}
	}
	System.out.println("Divisible by 5");
	for(int i=20;i<=40;i++)	
	{
		if(i%5==0)
		{
			System.out.println(i);
		}
		
	}
}
}
