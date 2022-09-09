package com.user.pack;

import java.util.Scanner;

public class addition 
{
    Scanner sc= new Scanner(System.in);
    public int meth()
    {
    	float a,b,c;
    	System.out.println(" Enter number");
    	a=sc.nextFloat();
    	System.out.println(" Enter number");
    	b=sc.nextFloat();
    	c=a+b;
    	System.out.println(c);
    	return (int)c;
    }
    
}
