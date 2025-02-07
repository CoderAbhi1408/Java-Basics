import java.util.Scanner;
class PoundToKilo
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the weight in pounds : ");
		float pound = sc.nextFloat();

		float kilo = pound * 0.454f;

		System.out.println(pound+ " pounds is "+kilo+" kilograms");
	}
}

	
