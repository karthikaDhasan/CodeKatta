//Wipro two
package pgm;

public class WIP {
public static void main(String args[]){
		
		int m=0,h,o=0,r=0,s=0,t=0,p = 0,j,temp=0,sum1=0,sum2=0,sum3=0,t1=0,t2=0,t3=0;
		
			int[] id= {1812,1813,1815};
			for(h=0;h<id.length;h++){
				int l=id[h];
				System.out.println("FOR THE EMPLOYEE"+ " " +l);
				String st=Integer.toString(l);
				char aa1[]=st.toCharArray();
					int x1=Integer.parseInt(Character.toString(aa1[3]));
					
			if(x1%2==0) {
				System.out.println("EVEN NUMBER" + " ");
				int[] n={678,235,431};
				for(int i=0;i<n.length;i++){
					int a=n[i];
					System.out.println("the number"+ " " +a);
				String sc=Integer.toString(a);
				char aa[]=sc.toCharArray();
					int x=Integer.parseInt(Character.toString(aa[0]));
					int y=Integer.parseInt(Character.toString(aa[1]));
					int z=Integer.parseInt(Character.toString(aa[2]));
					if(x>y && x>z){
						 m=x;
						 System.out.println("largest digit is:" +m);
					}
					else if(y>z && y>x){
						 o=y;
						 System.out.println("largest digit is:" +o);
					}
					else {
						p=z;
						System.out.println("largest digit is:" +p);
					}
					
                      }
				if(m>p && m>o)
				{
					System.out.println("largest no is:" +m);
					temp=m;
				}
				else if(o>p && o>m)
				{
					System.out.println("largest no is:" +o);
					temp=o;
				}
				else
				{
					System.out.println("largest no is:" +p);
					temp=p;
				}
				int fact=1;
				for(j=1;j<=temp;j++)
				{
					fact=fact*j;
				
				}
				System.out.println("Factorial of"+ " " +m+ " " +"is" + " " +fact);
			
				sum1=fact+temp;
				System.out.println("largest no is:" +temp);
						System.out.println("sum is:"+sum1);
				
			}
			else
			{
				System.out.println("ODD NUMBER" + " ");
				int[] n={678,235,431};
				for(int i=0;i<n.length;i++){
					int a=n[i];
					System.out.println("the number"+ " " +a);
				String sc=Integer.toString(a);
				char aa[]=sc.toCharArray();
					int x=Integer.parseInt(Character.toString(aa[0]));
					int y=Integer.parseInt(Character.toString(aa[1]));
					int z=Integer.parseInt(Character.toString(aa[2]));
					if(x<y && x<z){
						 m=x;
						 System.out.println(" smallest digit is:" +m);
					}
					else if(y<z && y<x){
						 o=y;
						 System.out.println("smallest digit is:" +o);
					}
					else {
						p=z;
						System.out.println(" smallest digit is:" +p);
					}
					
                     }
				if(m<p && m<o)
				{
					System.out.println(" smallest no is:" +m);
					temp=m;
				}
				else if(o<p && o<m)
				{
					System.out.println(" smallest no is:" +o);
					temp=o;
				}
				else
				{
					System.out.println(" smallest no is:" +p);
					temp=p;
				}
				int fact=1;
				for(j=1;j<=temp;j++)
				{
					fact=fact*j;
				
				}
				System.out.println("Factorial of"+ " " +m+ " " +"is" + " " +fact);
			
				sum1=fact+temp;
				System.out.println(" smallest no is:" +temp);
						System.out.println("sum is:"+sum1);
				
			}
}
}
}




