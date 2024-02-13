import java.util.Scanner;
class MultByTw0 
{
	public static void main(String args[]) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter r");
		int r = scan.nextInt();
		int i;
		int num=0xFFFFFFE;
		for(i=0;i<r;i++)
		{
			num=num<<1;
			System.out.println(num);
		}
	}
}
