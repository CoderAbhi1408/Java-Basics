import java.util.Scanner;
class AreaOfCircle 
{
	public static void main(String [] args)
	{
	Scanner sc= new Scanner(System.in);
	final float pi = 22/7;
	System.out.println("Enter the radius of circle(cm)");
	float r = sc.nextFloat();
	float area = pi*r*r;
	System.out.println("The Area of Circle with radius :" +r+ " is :" +area + " cm^2 ");
	
	float pm = 2 * pi * r;
	System.out.println("The perimeter of the same circle is :" +pm+ " cm");
	}
}
