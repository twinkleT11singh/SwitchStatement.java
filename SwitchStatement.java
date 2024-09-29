package hello;
import java.util.*;
public class SwitchStatement {
	
	public static void main(String[]args)
	{
		Scanner input =new Scanner(System.in);
		System.out.println("enter the first no.");
		int num1=input.nextInt();
		System.out.println("enter the second no.");
		int num2=input.nextInt();
		int result=0;
		System.out.println("+,-,*,/");
		
		char ch =input.next().charAt(0);
		switch(ch)
		{
		case'+':
			result=num1+num2;
			System.out.println("the sum of two nu. is :"+ result);
		    break;
		    
		case'-':
			result=num1-num2;
			System.out.println("the sub of two nu. is :"+ result);
		    break;
		    
		case'*':
			result=num1*num2;
			System.out.println("the mul of two nu. is :"+ result);
		    break;
		    
		case'/':
			result=num1/num2;
			System.out.println("the divi of two nu. is :"+ result);
		    break;
		}
		
	}

}
