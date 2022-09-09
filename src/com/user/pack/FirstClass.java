package com.user.pack;
import java.util.Scanner;
public class FirstClass 
{
   public static void main(String[] args) 
   {
	 Scanner sc= new Scanner(System.in);
	 System.out.println(" Enter a Number:");
	 int a=sc.nextInt();
	 System.out.println(" Enter b Number:");
     int b=sc.nextInt();
     System.out.println(" addition is : "+(a+b)
    		 +"\n"+" substraction  is : "+(a-b)
    		 +"\n"+" multiplication is : "+(a*b)
    		 +"\n"+" division is : "+(a/b)+"\n"+" modulas is : "+(a%b));
    }
}
