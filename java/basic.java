import java.util.*;

import java.lang.*;

import java.io.*;


/* Name of the class has to be "Main" only if the class is public. */

class Ideone1
{

	public static void main (String[] args) throws java.lang.Exception

	{
		// your code goes here
	
Scanner s=new Scanner(System.in);
		
int a=s.nextInt();2
		
int b=s.nextInt();
		
int c=a+b;
		
System.out.println(c);
	
	if(c%2==0)
	
	{
		
	System.out.println("even number");
	
	}
		
else
		
{
		
	System.out.println("odd number");
	
	}
		
 System.out.println("number from 1to 100");
		
 for(int i=1;i<=100;i++)
		
 {
		 System.out.println(i);	
		 }
     
       System.out.println("evenno from 1 to 100:");
	
for(int i=1;i<=100;i++)
	
{
		if(i%2==0)
		
{
			System.out.println(i);
		}

	}
	
 System.out.println("oddno from 1 to 100:");

	for(int i=1;i<=100;i++)

	{
		if(i%2!=0)
	
	{
			System.out.println(i);
		}
	
}
	

	
for(i=1;i<=100;i=i+3)

	{
		
System.out.println(i);
	
}
	int[] a=new int[]{10,40,40,40,11,10,20};
	
int n=a.length

	int i,j,t=0;
	
System.out.println("the first repeated element is:");

	for(i=0;i<n-1;i++)

	{
		for(j=0;j<i;j++)
		
{
			if(a[i+1]==a[j])
		
	{
				int b=i+1;
		
		if(n>b)
			
	{
				
 t=b;
	
			
	}
				
				
				
	
		}
		
	break;
		
		
}
	
		
	
	

            }
           
 System.out.println(a[t]);
}
}
import java.io.*;
class two
{
public static void main(String a[])
{
if(a.length==0)
{
System.out.println("no values");
}
else
{
for(int i=0;i<a.length;i++)
{
System.out.print(a[i]);
if(i<a.length-1)
{
System.out.print(",");
}
}
}
}
}import java.io.*;
public class one
{
public static void main(String a[])
{
int b=Integer.parseInt(a[0]);
int c=Integer.parseInt(a[1]);
int d=c+b;
System.out.println(d);
System.out.println(a[0] +"tech" +a[1]);
}
}

