import java.util.Scanner;
class CharDemo
{
	public static void main(String args[])
	{
		
		Scanner scan=new Scanner(System.in);
		System.out.println("enter ch1");
		String ch1 = scan.nextLine();
		System.out.println("enter ch2");
		String ch2 = scan.nextLine();
		System.out.println("ch1 and ch2 ");  
		System.out.println(ch1+" "+ch2);
	}
}