package com.user.pack;

import java.util.Scanner;

public class pallindrom
{
	Scanner sc=new Scanner(System.in);
    public void test()
    {
    	String s="";
    	String r="";
    	System.out.println(" Enter a String ");
    	s=sc.nextLine();
       for(int i=s.length()-1; i>=0;i--)
       {
    	   r=r+s.charAt(i);
       }
       System.out.println(r);
       if(s.equals(r))
       {
    	   System.out.println(" pallindrom ");
       }
       else 
       {
    	   System.out.println(" not Pallindrom ");
       }
    }
    public static void main(String[] args) 
    {
	    new pallindrom().test();
	}
}
