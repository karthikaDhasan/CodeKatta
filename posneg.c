#include <stdio.h>
int main(void)
{
	
	int N;
	printf("Enter the number:");
	scanf("%d",&N);
	if(N>=1 && N<=100000)
	{
	      if(N>=1 && N<=100000)
                  printf("Positive number");
              else 
    	         printf("Negative number");
	}
	else if(N==0)
                 printf("The number is zero");
	else
	    printf("Enter a valid number");
    	return 0;
}
