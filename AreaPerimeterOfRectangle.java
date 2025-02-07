import java.util.Scanner;
class AreaPerimeterOfRectangle
{
	public static void main(String [] args)
	{
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the Width of the rectangle : ");
	float width = sc.nextFloat();
	System.out.print("Enter the Height of the rectangle : ");
	float height = sc.nextFloat();
	float area =  width * height;
	System.out.println("The area of the rectangle is : "+area);

	float perimeter = 2*(width + height);
	System.out.println("Perimeter of the rectangle is : "+perimeter);
	}
}
