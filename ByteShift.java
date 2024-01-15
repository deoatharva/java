import java.util.Scanner;
class ByteShift 
{
	public static void main(String args[]) 
	{
		int i;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter byte a");
		byte a = scan.nextByte();
		byte b;
		i=a<<2;
		b=(byte)(a<<2);
		System.out.println("original value of a = " + a);
		System.out.println("i nad b = " +i+" "+b);
	}
}
