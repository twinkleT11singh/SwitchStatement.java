package hello;
import java.util.*;
public class primenumber {

	public static void main (String[]args)
	{
		int temp=0;
		for(int i=1;i<10-1;i++)
		{
			if(10%i==0) {
				temp=temp+1;
			}		
		}
		if(temp==0)
		{
			System.out.println("No. is prime");
		}
		else 
		{
			System.out.println("No. is not prime");
		}
	}
}
