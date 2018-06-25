public class k {
	public static void main(String args[]){
		 int b=0,a[]={15,11,13,3};

		   
		  
		    for (int n = 0; n<a.length; n++) {
		      boolean prime = true;
		          

		      for (int j = 2; j < a[n]; j++) {
		        if (a[n] % j == 0 ) {
		          prime = false;
		          break; 
		        }
		      }

	
		      if (prime) {    
		    	   b=b+a[n];
		        
		      }
		    }System.out.print(b + " ");//adding prime no
	}

}

