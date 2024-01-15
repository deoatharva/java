import java.util.Scanner;
class IncDec 
{
	public static void main(String args[]) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a");
		int a = scan.nextInt();
		System.out.println("enter b");
		int b = scan.nextInt();
		int c,d;
		c=++b;
		d=a++;
		c++;
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		System.out.println("d = " + d);
	}
}
