/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int  s=-628567,sum=0,t=0,sum1=0;
		int n=Math.abs(s);
	             while(n>0)
		{
			t=n%10;
			sum=sum+t;
			n=n/10;
		}	
		if(sum>9)
			{
				n=sum;
				sum=0;
				 while(n>0)
		{
			t=n%10;
			sum=sum+t;
			n=n/10;
		}	
				
			}
		
		sum1=sum;
		if(s<0)
		{
			sum1=-sum1;
		}
		else
		{
			sum1=sum1;
		}
		System.out.println(sum1);
	}
}
