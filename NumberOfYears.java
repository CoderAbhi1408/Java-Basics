import java.util.Scanner;
class NumberOfYears
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of minutes : ");
		long min = sc.nextLong();
		long years = min/(365*24*60);
		System.out.println("The number of years is : "+years);
	}
}