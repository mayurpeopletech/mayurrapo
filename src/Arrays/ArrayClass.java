package Arrays;

import java.util.Scanner;

public class ArrayClass 
{
    public static void main(String[] args)
    {
		int a[]=new int[5];
		Scanner sc= new Scanner(System.in);
		System.out.println(" Enter your values");
		for(int i=0; i<5;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println(" Output ");
		for(int i=0;i<5;i++)
		{
			System.out.println(a[i]);
		}
	}
}
