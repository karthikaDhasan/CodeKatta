//Wipro one

package pgm;

public class exc {
	
	public static void main(String args[]){
		
		int m,h,o,r=0,s=0,t=0,p = 0,fact=0,j,sum1=0,sum2=0,sum3=0,t1=0,t2=0,t3=0;
		
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
				System.out.println(m);
				int fact1=1;
				for(j=1;j<=m;j++)
				{
					fact1=fact1*j;
				
				}
				System.out.println("Factorial of"+ " " +m+ " " +"is" + " " +fact1);
				fact=fact1;
				sum1=fact+m;
				System.out.println("largest no is:" +m);
				System.out.println("sum is:"+sum1);
			}
			else if(y>z && y>x){
				 o=y;
				
				int fact2=1;
				for(j=1;j<=o;j++)
				{
					fact2=fact2*j;
				
				}
				System.out.println("Factorial of"+ " " +o+ " "+ "is" + " "+fact2);
				fact=fact2;
				sum2=fact+0;
				System.out.println("largest no is:" +o);
				System.out.println("sum is:" +sum2);
				
			}
			else {
				p=z;
				
				int fact3=1;
				for(j=1;j<=p;j++)
				{
					fact3=fact3*j;
				
				
				}
				System.out.println("Factorial of" + " "+p+ " "+"is" + " "+fact3);
				fact=fact3;
				sum3=fact+p;
				System.out.println("largest no is:" +p);
				System.out.println("sum is:" +sum3);
				
			}
				}
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
					 r=x;
					
					int fact1=1;
					for(j=1;j<=r;j++)
					{
						fact1=fact1*j;
					
					}
					System.out.println("Factorial of" + " "+r+ " "+"is" + " "+fact1);
					fact=fact1;
					sum1=fact+r;
					System.out.println("Smallest Digit is"+ " " +r);
					System.out.println("sum is:" +sum1);
					}
				
				else if(y<z && y<x){
					 s=y;
					
					int fact2=1;
					for(j=1;j<=s;j++)
					{
						fact2=fact2*j;
					
					}
					System.out.println("Factorial of" + " "+s+ " "+"is" + " "+fact2);
					fact=fact2;
					sum2=fact+s;
					System.out.println("Smallest Digit is"+ " " +s);
					System.out.println("sum is:" +sum2);
					
				}
				else {
					t=z;
					
					int fact3=1;
					for(j=1;j<=t;j++)
					{
						fact3=fact3*j;
					
					}
					System.out.println("Factorial of" + " "+t+ " "+"is" + " "+fact3);
					fact=fact3;
					sum3=fact+t;
					System.out.println("Smallest Digit is"+ " " +t);
					System.out.println("sum is:" +sum3);
		        }
				
	}
	
			}

	}
	}
	}
