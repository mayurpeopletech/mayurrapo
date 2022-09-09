package Statements;
import java.util.Scanner;
public class Hotel 
{
	Scanner sc=new Scanner(System.in);
	 void meth()
	   {
		 int n,m, Adult,total,child,amount;
		String name,room;
		    System.out.println(" Welcome to the Shimla \n Two Hotel are Available \n Press 1 for Radisson Hotel\n Press 2 for Hotel Paradish ");
		    n=sc.nextInt();
		    if(n==1)
		    {
		    	System.out.println(" Please choose the Room "+"\n"+" 1 Press for -AC ₹3000 "+"\n"+" 2 Press for -Non AC ₹2500 ");
		    	m=sc.nextInt();
		    	if(m==1)
		    	{
		    		System.out.println(" You Choose Radisson Hotel ");
		    		System.out.println(" Welcome to the Shimla Ac Hotel");
		    		System.out.println(" Enter the Number of Adults :");
		    		Adult=sc.nextInt();
		    		System.out.println(" Enter the Number of child :");
		    		child=sc.nextInt();
		    		total=Adult+child;
		    		if(total<=4)
		    		{ 
		    		  	System.out.println(" Only one room is require for your family  "+ total);
		    		}
		    		else 
		    		{
		    			System.out.println(" you should to Book extra Room for the your family person "+ total);
		    		}
		    		System.out.println(" Enter the Hotel name :");
		    		name=sc.next();
		    		System.out.println(" Enter the type of room :");
		    		room=sc.next();
		    		System.out.println(" Enter the Amount ");
		    		amount=sc.nextInt();
		    		System.out.println(" Adult: "+Adult);
		    		System.out.println(" child: "+child);
		    		System.out.println(" name: "+name);
		    		System.out.println(" room: "+room);
		    		System.out.println(" amount: "+amount);
		    	}
		    	else if(m==2)
		    	{
		    		System.out.println(" You Choose Radisson Hotel ");
		    		System.out.println(" Welcome to the Shimla Non-Ac Hotel");
		    		System.out.println(" Enter the Number of Adults :");
		    		Adult=sc.nextInt();
		    		System.out.println(" Enter the Number of child :");
		    		child=sc.nextInt();
		    		total=Adult+child;
		    		if(total<=4) {
		    			System.out.println(" Only one room is require for your family: " +total);
		    		}
		    		else 
		    		{
		    			System.out.println(" you should to Book extra Room  for Your Family Person: "+ total);
		    		}
		    		System.out.println(" Enter the Hotel name :");
		    		name=sc.next();
		    		System.out.println(" Enter the type of room :");
		    		room=sc.next();
		    		System.out.println(" Enter the Amount ");
		    		amount=sc.nextInt();
		    		System.out.println(" Adult: "+Adult);
		    		System.out.println(" child: "+child);
		    		System.out.println(" name: "+name);
		    		System.out.println(" room: "+room);
		    		System.out.println(" amount: "+amount);
		    	}
		    	else
		    	{
		    		System.out.println(" Invalid Button You pressed ");
		    	}
		    }
		    else if(n==2)
		    {
		    	System.out.println(" You Choose Hotel 2. ");
		    	System.out.println(" please Choose the Room "+"\n"+" 1-AC ₹2000 "+"\n"+" 2-Non AC ₹1800");
		    	m=sc.nextInt();
		    	if(m==1)
		    	{
		    		System.out.println(" You Choose Hotel 2. Paradish ");
		    		System.out.println(" Welcome to the Shimla Ac Hotel");
		    		System.out.println(" Enter the Number of Adults :");
		    		Adult=sc.nextInt();
		    		System.out.println(" Enter the Number of child :");
		    		child=sc.nextInt();
		    		total=Adult+child;
		    		if(total<=4) {
		    			System.out.println(" Only one room is require for your family:  "+ total);
		    		}
		    		else 
		    		{
		    			System.out.println(" you should to Book extra Room for the your family person: "+ total);
		    		}
		    		System.out.println(" Enter the Hotel name :");
		    		name=sc.next();
		    		System.out.println(" Enter the type of room :");
		    		room=sc.next();
		    		System.out.println(" Enter the Amount ");
		    		amount=sc.nextInt();
		    		System.out.println(" Adult: "+Adult);
		    		System.out.println(" child: "+child);
		    		System.out.println(" name: "+name);
		    		System.out.println(" room: "+room);
		    		System.out.println(" amount: "+amount);
		    	}
		    	else if(m==2)
		    	{
		    		System.out.println(" You Choose Hotel 2. Paradish ");
		    		System.out.println(" Welcome to the Shimla Non-Ac Hotel");
		    		System.out.println(" Enter the Number of Adults :");
		    		Adult=sc.nextInt();
		    		System.out.println(" Enter the Number of child :");
		    		child=sc.nextInt();
		    		total=Adult+child;
		    		if(total==4) {
		    			System.out.println(" Only one room is require for your family: "+ total);
		    		}
		    		else 
		    		{
		    			System.out.println(" you should to Book One more Room for your family person: "+total);
		    		}
		    		System.out.println(" Enter the Hotel name :");
		    		name=sc.next();
		    		System.out.println(" Enter the type of room :");
		    		room=sc.next();
		    		System.out.println(" Enter the Amount ");
		    		amount=sc.nextInt();
		    		System.out.println(" Adult: "+Adult);
		    		System.out.println(" child: "+child);
		    		System.out.println(" name: "+name);
		    		System.out.println(" room: "+room);
		    		System.out.println(" amount: "+amount);
		    	}
		    	else 
		    	{
		    		System.out.println(" You pressed Invalid Button");
		    	}
		    }
		    else
	    	{
	    		System.out.println(" Invalid Button You pressed ");
	    	}
	   }
    public static void main(String[] args) 
    {
	    new Hotel().meth();	
	}
}
