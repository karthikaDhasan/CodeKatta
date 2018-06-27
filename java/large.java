
public class ggg {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n[]={54,27},i,t;
		int s,s1=0;
		
 for(i=0;i<n.length;i++)
 {
	 s=0;
	 int b=n[i];
while(n[i]>0)
{
	
t=n[i]%10;
if(t>=s)
{
	s=t;
	s1=s;
}
n[i]=n[i]/10;
}
System.out.println("great" +" " +b+ " " +s);
		
}
 
	}

}
