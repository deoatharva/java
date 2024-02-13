import java.util.Scanner;
class BoolLogic1
{
	public static void main(String args[]) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter Boolean a");
		boolean a = scan.nextBoolean();
		System.out.println("enter Boolean b");
		boolean b = scan.nextBoolean();
		boolean c=a|b,d=a&b,e=a^b,f=(!a&b)|(a&!b),g=!a;
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("a|b = " + c);
		System.out.println("a&b = " + d);
		System.out.println("a^b = " + e);
		System.out.println("(!a&b)|(a&!b) = " + f);
		System.out.println("!a = " + g);
	}
}
