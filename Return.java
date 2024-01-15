import java.util.Scanner;
class Return 
{
	public static void main(String args[]) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter t boolean value");
		boolean t = scan.nextBoolean();
      		//boolean t=true;
      		System.out.println("before the return ");
      		if(t) return;
      		System.out.println("this won't execute ");
    	}
}
