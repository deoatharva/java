import java.util.Scanner;
class BoolTest
{
	public static void main (String args[])
	{
		Scanner scan=new Scanner(System.in);
		boolean b;
		/b=false;
		//System.out.println("b is "+b);
		//b=true;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter boolean b");
		boolean b = scan.nextBoolean();
		System.out.println("b is "+b);
		if (b) System.out.println("this is executed");
		b=false;
		if(b) System.out.println("this is not executed");
		System.out.println("10>9 is"+(10>9));
	}
}
