import java.util.Scanner;
class Ternary1
{
	public static void main(String args[]) 
	{
      		int i,k;
      		//i=10;
      		Scanner scan=new Scanner(System.in);
		System.out.println("enter i (positive value)");
		i = scan.nextInt();
      		k=i<0?-i:i;
		System.out.println("absolute value of ");
      		System.out.println(i+" is " + k);
      		//i=-10;
		System.out.println("enter i (negative value)");
		i = scan.nextInt();
      		k=i<0?-i:i;
      		System.out.println("absolute value of ");
      		System.out.println(i+" is " + k);
    	}
}
