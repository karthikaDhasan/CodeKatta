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
		Ideone ie=new Ideone();
	      ie.add(2,2);
	      ie.add(2333,233);
	}
		  	public void add(int input1,int input2)
		{
			int a=input1,b=input2,s=0;
			String c=Integer.toString(a);
			char c2[]=c.toCharArray();
			String d=Integer.toString(b);
	             	char d2[]=d.toCharArray();
			int n=c.length();
			int m=d.length();
			int n=c.length()-1;
			int m=d.length()-1;
			
			for(int i=n;i<=n;i++)
		     	{
			 int c1=Integer.parseInt(Character.toString(c2[n]));
			int d1=Integer.parseInt(Character.toString(d2[m]));
				s=c1+d1;
			     System.out.println("ss"+ " " +s);
		     	}
		}
	
}
