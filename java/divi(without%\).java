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
		Scanner sc=new Scanner(System.in);
	
		int i2[]=new int[sc.nextInt()];
	
	            for(int i=0;i<i2.length;i++)
	             {
	              i2[i]=sc.nextInt();
		while(i2[i]>=10)
		{            
			i2[i]=i2[i]-10;
			
		}
		if(i2[i]==0)
		{
			System.out.println("divisible");
		}
		else
		{
			System.out.println("non divisible");
		}
	             }
	}
}

OUTPUT:
n=2
10
13
  ANSWER:
   divi
non divi
