package com.user.pack;

import java.util.Scanner;

public class ClassB
{
   public static void main(String[] args) 
   {
	   Scanner sc= new Scanner(System.in);
	   String a,b;
	   System.out.println(" Enter value ");
	   a=sc.next();
	   System.out.println(" Enter value ");
	   b=sc.next();
	   int c,d;
	   c=Integer.parseInt(a);
	   d=Integer.parseInt(b);
	   System.out.println(a+b);
	   System.out.println(c+d);
}
}
