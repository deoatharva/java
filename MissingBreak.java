import java.util.Scanner;
class MissingBreak 
{
	public static void main(String args[]) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter r");
		int r = scan.nextInt();
		for(int i=0;i<r;i++)
		switch(i)
		{
			case 0:
			case 1:
			case 2:
			case 3:
			case 4:
				System.out.println("i is less than 5");
				break;
			case 5:
			case 6:
			case 7:
			case 8:
			case 9:
				System.out.println("i is less than 9");
				break;
			default:
				System.out.println("i is more than 10");
		}
	}
}
