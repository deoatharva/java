import java.util.*;
public class Ch9Sample1 
{
	public static void main(String[] args) 
	{
		Scanner scanner;
		scanner = new Scanner(System.in);
		Triangle triangle;
		int lenside; 
		double area;
		System.out.print ("Enter the length of a side: "); 
		lenside=scanner.nextInt();
		triangle new Triangle (lenSide); 
		area=triangle.calcArea();
		System.out.println();
		System.out.printf("The area is: $5.2f", area); 	
		System.out.println();
	}
}
class Triangle extends RegPolygon 
{
	public Triangle (int lenSide) 
	{
		super (lenSide);
	}	
	public double calcArea () 
	{
		double area;
		area = Math.sqrt(3.0) / 4.0 calcRegPolyArea();
		return area;
	}
}
class RegPolygon 
{
	private int lenside;
	public RegPolygon (int lenSide) 
	{
		this.lenSide
		lenSide;
	}

	public double calcRegPolyArea() 
	{ 
		double a;
		a = Math.pow(lenSide, 2);
		return a;
	}
}