import java.util.Scanner;
class pascal
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number of row");
		int row=scan.nextInt();
		pascal(row,0);
	}
	public static void pascal(int row,int crow)
	{
		if(crow < row)
		{
			spaces(row - crow - 1);
			prow(1,crow,0);
			System.out.println();
			pascal(row,crow+1);
		}
	}
	public static void prow(int cnum,int tnum,int ccol)
	{
		if(ccol<cnum)
		{
			System.out.print(cnum+" ");
			prow((cnum*(tnum-ccol))/(ccol+1),tnum,ccol+1);
		}
	}
	public static void spaces(int count)
	{
		if(count>0)
		{
			System.out.print(" ");
			spaces(count-1);
		}
	}
}
