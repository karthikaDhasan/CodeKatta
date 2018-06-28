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
	            String s1=sc.nextLine();
	            String s2=sc.nextLine();
		String s3=s1.concat(" " +s2);
		System.out.println(s3);
		String[] s4=s3.split(" ");
		for(String s5:s4)
		{
			StringBuilder s=new StringBuilder(s5);
			System.out.print(s.reverse() + " ");
		}
		
	}
}
