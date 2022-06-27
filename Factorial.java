import java.util.*;

class Factorial
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int fact = 1;

		System.out.print("\n\t\t\tEnter number : ");
			int n = sc.nextInt();

		System.out.println("\n\t\t\t=============================");

		int i=n;

		while(n>0)
		{
			fact = fact * n;

			n--;
		}
		
			System.out.println("\n\t\t\tFactorial of "+i+" is : " +fact);

	}

}