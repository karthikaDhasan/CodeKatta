
public class palindrome {

	/**
	 * @param args
	 */
	public int isp(String input1)
	{
		String r=input1;
		int a=0;
		char[] s=r.toCharArray();
		StringBuilder b=new StringBuilder(r);
		StringBuilder c=b.reverse();
		String st=new String(c);
		char[] s1=st.toCharArray();
		for(int i=0;i<s.length;i++)
		{
			if(s[i]==s1[i])
			{
				a=1;
			}
			else 
			{
				a=2;
			}
			
		}
		return a;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        palindrome d= new palindrome();
        int e=d.isp( "Madam");
        if(e==1)
        {
        	System.out.println("PALINDROME");
        }
        else if(e==2)
        {
        	System.out.println("NOT PALINDROME");
        }
	}

}
OUTPUT:Madam-not palindrome

ANOTHER METHOD:

public class palindrome {

	/**
	 * @param args
	 */
	public int isp(String input1)
	{   
		int a=0;
		StringBuilder sb=new StringBuilder(input1);
		String input2=sb.reverse().toString();
		 if(input1.equalsIgnoreCase( input1))
			{
				a=1;
			}
			else 
			{
				a=2;
			}
			
		
		return a;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        palindrome d= new palindrome();
        int e=d.isp( "Madam");
        if(e==1)
        {
        	System.out.println("PALINDROME");
        }
        else if(e==2)
        {
        	System.out.println("NOT PALINDROME");
        }
	}

}
OUTPUT:Madam-palindrome
