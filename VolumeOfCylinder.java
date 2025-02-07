import java.util.Scanner;
class VolumeOfCylinder
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		double pi = 22/7d;
		System.out.print("Enter the radius of cylinder : ");
		double r = sc.nextFloat();
		System.out.print("Enter thee height of the cylinder : ");
		double h = sc.nextFloat();
		double area = pi * r * r;
		double volume = area * h;
		System.out.println("The area is : "+area);
		System.out.println("The volume is : "+volume);
	}
}