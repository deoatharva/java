import java.util.Scanner;
class BasicMath 
{
	public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a");
		int a = scan.nextInt();
		int b=a*3;
		int c=b/4;
		int d=c-a;
		int e=-d;
		System.out.println("a= " + a);
		System.out.println("b= " + b);
		System.out.println("c= " + c);
		System.out.println("d= " + d);
		System.out.println("e= " + e);
		System.out.println("floating point arithmatic" );
		System.out.println("enter da");
		Double da = scan.nextDouble();
      		double db=da*3;
		double dc=db/4;
		double dd=dc-da;
		double de=-dd;
		System.out.println("da= " + da);
		System.out.println("db= " + db);
		System.out.println("dc= " + dc);
		System.out.println("dd= " + dd);
		System.out.println("de= " + de);
	}
}
