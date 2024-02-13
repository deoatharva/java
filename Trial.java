//to declare a variable of byte datatype and short accept the value from the user store the value and perform incremente on byte value and decrement on short then swap value with out temp variable
import java.util.Scanner;
class Trial{
	public static void main (String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("enter b1");
		byte b1 = scan.nextByte();
		System.out.println("enter sh1");
		short sh1 = scan.nextShort();
		b1++;
		sh1--;
		System.out.println("after increment b1 :"+b1+"decrement short :"+sh1);
		b1=(byte) (sh1+b1);
		sh1=(short)(sh1-b1);
		b1=(byte)(sh1-b1);
		System.out.println("interchanged values are of b1"+b1+"and short :"+sh1);
}
}
