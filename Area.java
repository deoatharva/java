import java.util.Scanner;
class Area
{
	public static void main(String args[])
	{
		double pi,r,a;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter r");
		r = scan.nextDouble();
		pi=3.1416;
		a=pi*r*r;
		System.out.println("area of circle "+a);
	}
}