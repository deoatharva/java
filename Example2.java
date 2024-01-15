import java.util.Scanner;
class Example2
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter num");
		int num=scan.nextInt();	
		System.out.println("this is num "+num);
		num=num*2;
		System.out.println("the value of num * 2 is ");
		System.out.println(num);

	} 
}
