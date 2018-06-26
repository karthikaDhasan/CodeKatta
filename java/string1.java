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
		String st=sc.nextLine();
		String[] sp=st.split(" ");
		String s2="";
		int i;
		System.out.println("after split:");
		
		for(String  s1:sp)
		{          
			System.out.print(" " +s1);
			
			s2=s1;
		}
		System.out.println(" ");
		System.out.println("the reverse:"); 
		for(String s1:sp)
		{
		 StringBuilder sb=new StringBuilder(s1);
		 System.out.print(sb.reverse());
		 String b=new String(sb);
		 for(i=0;i<b.length();i++)
		      { 
		
		char a[]=b.toCharArray();
		 
		   if(Character.isUpperCase(a[i]))
		  {
		     System.out.print(Character.toLowerCase(a[i]));
		      	
		      	
		  }
		  else
		  {
		  	System.out.print(Character.toUpperCase(a[i]) );
		  }
		}
	}
		
		
	
	}
	
}
