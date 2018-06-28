import java.util.Scanner;


public class ddd {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				int i;
				System.out.println("enter the string:");
				Scanner sc=new Scanner(System.in);
				String st=sc.nextLine();
				
				String[] sp=st.split(" ");
				
					for(String s1:sp)
					{
						StringBuilder sb=new StringBuilder(s1);
						System.out.print(" " +sb.reverse().toString());
					}
					System.out.println(" ");
					for(String s1:sp)
					{
					 StringBuilder sb=new StringBuilder(s1);
					 
					 String b=new String(sb.reverse() );
					 for(i=0;i<b.length();i++)
					      { 
					
					char a[]=b.toCharArray();
					char a1[]=s1.toCharArray();
					 
					   if(Character.isUpperCase(a1[i]))
					  {
					     System.out.print(Character.toUpperCase(a[i]));
					      	
					      	
					  }
					  else
					  {
					  	System.out.print(Character.toLowerCase(a[i]) );
					  }
					   
					}
				}
			
					System.out.println(" ");
					for(String s1:sp)
					{
					 StringBuilder sb=new StringBuilder(s1);
					 
					 String b=new String(" " +sb.reverse());
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
OUTPUT:
enter the string:
Wipro Technologies Bangalore
 orpiW seigolonhceT erolagnaB 
OrpiwSeigolonhcetErolagnab 
 ORPIw SEIGOLONHCEt EROLAGNAb
	
