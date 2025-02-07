import java.util.Scanner;
class FinApp
{
	public static void main(String [] args)
	{
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the subtotal : ");
	float st = sc.nextFloat();
	System.out.print("Enter the gratuity rate : ");
	float tr = sc.nextFloat();

	float tip = (tr*st)/100;
	System.out.println("Tip is : "+tip);
	float total = st + tip;
	System.out.println("Total is : "+total);
	}
}