// pattern dollar
import java.util.Scanner;
class dollar 
{
    	public static void main(String[] args) 
    	{
    		Scanner scan = new Scanner(System.in);
     	   	System.out.println("enter the value of a");
     	   	int a = scan.nextInt();
     	   	pattern(a,1);
    	}
    	public static void pattern(int a,int b){
    		if(b>a){
    			return;
    		}
    		else
    		{
    			ps(b);
    			System.out.println();
    			pattern(a,b+1);
    		}
	}
	public static void ps(int count)
	{
		if(count==0){
			return;
		}
		else
		{
			System.out.print("$");
			ps(count-1);
		}
	}
}

