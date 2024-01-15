import java.util.Scanner;
class BitLogic 
{
	public static void main(String args[]) {
		String binary[]={
		"0000","0001","0010","0011","0100","0101","0110","0111","1000","1001","1010","1011","1100","1101","1110","1111"
		};
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a");
		
		int a = scan.nextInt();
		System.out.println("enter b");
		int b = scan.nextInt();
		int c=a|b,d=a&b,e=a^b,f=(~a&b)|(a&~b),g=~a&0x0f;
		System.out.println("a = " +binary[a] );
		System.out.println("b = " +binary[b] );
		System.out.println("a|b = " +binary[c] );
		System.out.println("a&b = " +binary[d] );
		System.out.println("a^b = " +binary[e] );
		System.out.println("(~a&b)|(a&~b) = " +binary[f] );
		System.out.println("~a&0x0f = " +binary[g] );
	}
}
