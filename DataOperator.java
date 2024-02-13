import java.util.Scanner;
class DataOperator
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter b1");
		byte b1 = scan.nextByte();
		System.out.println("enter sh1");
		short sh1 = scan.nextShort();
		short s1=(short)(b1+sh1);
		boolean b2;
		System.out.println("b1+sh1 : "+s1);
		s1=(short)(b1-sh1);
		System.out.println("b1-sh1 : "+s1);
		s1=(short)(b1*sh1);
		System.out.println("b1*sh1 : "+s1);
		s1=(short)(b1/sh1);
		System.out.println("b1/sh1 : "+s1);
		s1=(short)(b1%sh1);
		System.out.println("b1%sh1 : "+s1);
		b2=(boolean)(b1>sh1);
		System.out.println("b1>sh1 : "+s1);
		b2=(boolean)(b1<sh1);
		System.out.println("b1<sh1 : "+s1);
		b2=(boolean)(b1>=sh1);
		System.out.println("b1>=sh1 : "+s1);
		b2=(boolean)(b1<=sh1);
		System.out.println("b1<=sh1 : "+s1);
	//	s1=(short)(b1<>sh1);
	//	System.out.println("b1<>sh1 : "+s1);
		b2=(boolean)(b1!=sh1);
		System.out.println("b1!=sh1 : "+s1);
		s1=(short)(b1>>sh1);
		System.out.println("b1>>sh1 : "+s1);
		s1=(short)(b1<<sh1);
		System.out.println("b1<<sh1 : "+s1);
		s1=(short)(b1>>>sh1);
		System.out.println("b1>>>sh1 : "+s1);
		System.out.println("b1 && sh1 : " + ((b1 != 0) && (sh1 != 0)));
		System.out.println("b1 || sh1 : " + ((b1 != 0) || (sh1 != 0)));
		s1=(short)(b1&sh1);
		System.out.println("b1&sh1 : "+s1);
		s1=(short)(b1|sh1);
		System.out.println("b1|sh1 : "+s1);
	}
}
