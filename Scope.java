import java.util.Scanner;
class Scope 
{
	public static void main(String[] args) 
    	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter x as 10");
		int x = scan.nextInt();
		if(x==10)
		{
            		int y=20;
            		System.out.println("x and y are "+x+" "+y);
        		}
        		System.out.println("x is "+x);
    	}
}
