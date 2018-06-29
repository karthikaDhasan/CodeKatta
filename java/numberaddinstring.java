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
		String  s1= sc.nextLine();
		String str="";
		int sum=0,c1=0;
		for(int i=0;i<s1.length();i++){
			char c =s1.charAt(i);
			if(Character.isDigit(c)){
				str=str+c;
				c1++;
			}
			else{
				if(c1>0){
					sum=sum+Integer.valueOf(str);
				c1=0;	
				str="";
				}
			}
		}
		sum+=Integer.parseInt(str);
		System.out.println(sum);
		

	}
}
