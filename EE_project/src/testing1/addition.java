package testing1;
import java.util.*;
public class addition 
{

	public static void main(String[] args)
	{
		int a,b,c;
		System.out.println("Enter the first value:");
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		System.out.println("Enter the second value:");
		b=s.nextInt();
		c=a+b;
		System.out.println("sum of two values:"+c);
	}

}
