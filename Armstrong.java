package hello;
import java.util.*;
public class Armstrong {

	public static void main (String[]args)
	{
	int n=130;
	int temp=n;
	int r,sum=0;
	
	while(n>0)
	{
	        r=n%10;
			n=n/10;
			sum=sum+r*r*r;
	}		
 if (temp==sum)
	 System.out.println("It is an Armstrong number");
	 
 else 
	 System.out.println("It is not Armstrong number");
 }
	
}

