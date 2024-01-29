import java.util.Scanner;
class MinMax 
{
	public static void max(float a1,float a2,float a3,float a4,float a5){
		if(a1>=a2 && a1>=a3 && a1>=a4 && a1>=a5)
		{
			System.out.println("largest  value is a1 "+a1);
		}
		else if(a2>=a1 && a2>=a3 && a2>=a4 && a2>=a5){
			System.out.println("largest  value is a2 "+a2);
		}
		else if(a3>=a1 && a3>=a2 && a3>=a4 && a3>=a5){
			System.out.println("largest  value is a3 "+a3);
		}
		else if(a4>=a1 && a4>=a2 && a4>=a3 && a4>=a5){
			System.out.println("largest  value is a4 "+a4);
		}
		else{
			System.out.println("largest  value is a5 "+a5);
		}
	}

	public static void min(float a1,float a2,float a3,float a4,float a5){
		if(a1<=a2 && a1<=a3 && a1<=a4 && a1<=a5)
		{
			System.out.println("smallest  value is a1 "+a1);
		}
		else if(a2<=a1 && a2<=a3 && a2<=a4 && a2<=a5){
			System.out.println("smallest  value is a2 "+a2);
		}
		else if(a3<=a1 && a3<=a2 && a3<=a4 && a3<=a5){
			System.out.println("smallest  value is a3 "+a3);
		}
		else if(a4<=a1 && a4<=a2 && a4<=a3 && a4<=a5){
			System.out.println("smallest  value is a4 "+a4);
		}
		else{
			System.out.println("smallest  value is a5 "+a5);
		}
	}
	public static void main(String[] args) 
	{
		float a1,a2,a3,a4,a5;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a1");
		a1=scan.nextFloat();
		System.out.println("enter a2");
		a2=scan.nextFloat();
		System.out.println("enter a3");
		a3=scan.nextFloat();
		System.out.println("enter a4");
		a4=scan.nextFloat();
		System.out.println("enter a5");
		a5=scan.nextFloat();
		max(a1,a2,a3,a4,a5);
		min(a1,a2,a3,a4,a5);
	}
}
