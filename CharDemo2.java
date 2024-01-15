import java.util.Scanner;
class CharDemo2
{
	public static void main(String agrs[])
	{
		//String ch1;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter Char ch1");
		char ch1 = scan.nextLine().charAt(0); 
		System.out.println("ch1 contains"+ch1);
		ch1++;
		System.out.println("ch1 is now "+ch1);


	}
}