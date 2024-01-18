import java.util.Scanner;
class promote {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
		System.out.println("enter byte b");
		byte b = scan.nextByte();
        System.out.println("enter char c");
		char c = scan.next().charAt(0);
        System.out.println("enter short s");
		short s = scan.nextShort();
        System.out.println("enter int i");
		int i = scan.nextInt();
        System.out.println("enter float f");
		float f = scan.nextFloat();
        System.out.println("enter double d");
		double d = scan.nextDouble();
        double result=(f*b)+(i / c)-(d*s);
        System.out.println((f*b)+" + "+(i / c)+" - "+(d*s));
        System.out.println("result ="+result);
    }
}
