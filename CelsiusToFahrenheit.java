import java.util.Scanner;
class CelsiusToFahrenheit
{
	public static void main(String [] args)
	{
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the temperature in celsius : ");
	double cel = sc.nextDouble();

	double far = (9.0/5)*cel+32;
	System.out.println(cel+ " celsius is "+far+ "Fahrenheit");
	}
}
