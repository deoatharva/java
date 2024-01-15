import java.util.Scanner;
class SampleSwitch 
{
	public static void main(String args[]) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a less that 3");
		int a = scan.nextInt();
      		for(int i=0;i<a;i++)
      		{
      			switch(i)
      			{
        				case 0:
          				System.out.println("i is zero");
          				break;
        				case 1:
          				System.out.println("i is one");
          				break;
        				case 2:
          				System.out.println("i is two");
          				break;
        				case 3:
          				System.out.println("i is three");
          				break;
      			}
    		}
      		System.out.println("i is greater than 3");
	}
}
