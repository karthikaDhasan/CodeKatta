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
			String s="wipro@tech";
		String[] a=s.split("@");
		for(String b:a)
		{            
			System.out.println(b);
			String c=b;
			StringBuilder c1=new StringBuilder(c);
			c1.reverse();
				System.out.println(c1);
		}
	}
}
