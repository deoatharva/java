import java.util.Scanner;
class Modulus 
{
	public static void main(String args[]) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter  int x");
		int x = scan.nextInt();
		System.out.println("enter double y");
		double y = scan.nextDouble();
		System.out.println("x mod 10 = " + x % 10);
		System.out.println("y mod 10 = " + y % 10);
	}
}
