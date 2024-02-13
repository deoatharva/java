// pattern diamond
import java.util.Scanner;
class Diamond 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the value of a");
		int a = scan.nextInt();
		if(a%2==0)
		{
			System.out.println("can you please enter odd number so my program will run nicely");
		}
		else
		{
			pattern(a,1);
			bottom(a,1);
		}
	}
	
	public static void pattern(int a,int cr){
		if(cr<=a)
		{
			for(int i=0;i<a-cr;i++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<2*cr-1;j++)
			{
				System.out.print("*");
			}
			System.out.println();
			pattern(a,cr+1);
		}
	}
	
	public static void bottom(int a,int cr){
		if(cr<=a-1)
		{
			for(int i=0;i<cr;i++){
				System.out.print(" ");
			}
			for(int j=0;j<2*(a-cr)-1;j++){
				System.out.print("*");
			
			}
		System.out.println();
		bottom(a,cr+1);
		}
	}
}
