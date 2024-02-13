import java.util.Scanner;
class Continue
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		short sh1;
		System.out.println("enter sh1");
		sh1=scan.nextShort();
		int i=1;
		while(i<=sh1)
		{
			if(i%2==0)
			{
				i++;
				continue;
			}
			else
			{
				System.out.print(i+",");
				i++;
			}
		}
	}
}
