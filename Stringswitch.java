import java.util.Scanner;
class Stringswitch
{
	public static void main(String args[]) 
	{
        		Scanner scan=new Scanner(System.in);
		System.out.println("enter str number below 6");
		String str = scan.nextLine();
        		switch(str)
        		{
            		case "one":
                			System.out.println("one");
                			break;
            		case "two":
                			System.out.println("two");
                			break;
            		case "three":
                			System.out.println("three");
                			break;
            		default:
                			System.out.println("no match");
                			break;
        		}
    	}
}
