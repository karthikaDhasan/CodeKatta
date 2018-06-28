
public class palindrome {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=1234,t=0,t1=0;
		String b=Integer.toString(a);
		if(b.charAt(0)!=0)
		{
			int s=Integer.parseInt(b);
			do
			{
				while(s>0)
			{
				
					t=s%10;
					t1=t1+t;
					s=s/10;
				
			 }
			}while(t1>9);
			
			System.out.println("+" +t1);
			
		}
		else
		 System.out.println("-" +t1);
	}

}
