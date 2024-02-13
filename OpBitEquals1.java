import java.util.Scanner;
class OpBitEquals1 
{
	public static void main(String args[]) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a");
		int a = scan.nextInt();
		System.out.println("enter b");
		int b = scan.nextInt();
		System.out.println("enter c");
		int c = scan.nextInt();
		a|=4;
		b>>=1;
		c>>=1;
		a^=c;
		System.out.println("a=" + a);
		System.out.println("b=" + b);
		System.out.println("c=" + c);
	}
}
