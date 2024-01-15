import java.util.Scanner;
class Break 
{
	public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter boolean t");
		boolean t = scan.nextBoolean();
		first:{
			second:{
				third:{
					System.out.println("before the break");        
					if (t) break second;
					System.out.println("this won't execute ");
				}
				System.out.println("this won't execute");
			}
			System.out.println("this is after second bloak");
		}     
	}
}
