import java.util.Scanner;
class Conversion {
    public static void main(String[] args) {
        byte b;
        Scanner scan=new Scanner(System.in);
	System.out.println("enter i");
	int i = scan.nextInt();
        System.out.println("enter d");
	double d = scan.nextDouble();
        //int i=34;
        //double d=34.34;
        System.out.println("Conversion of int to byte");
        b = (byte) i;
        System.out.println("i and b "+i+" "+b);
        System.out.println("Conversion of Double to int");
        i = (int) d;
        System.out.println("d and i "+d+" "+i);
        System.out.println("conversion of double to byte");
        b = (byte) d;
        System.out.println("d and b"+ d +" "+ b);
    }
}
