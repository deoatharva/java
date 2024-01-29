// to define a value of byte datatype ad assigned it to a variable find short and display it. Define a value of integer datatype and assign it to variable to find byte and display it
import java.util.Scanner;
class impemp
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter byte b1:");
		byte b1=scan.nextByte();
		System.out.println("enter short sh1:");
		short sh1=scan.nextShort();
		System.out.println("byte b1:"+b1);
		System.out.println("short sh1:"+sh1);
		byte b2=(byte)sh1;
		short sh2=(short)b1;
		System.out.println("byte b2:"+b2);
		System.out.println("short sh2:"+sh2);
	}
} 
