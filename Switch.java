import java.util.Scanner;
class Switch 
{
	public static void main(String args[]) 
	{
      		Scanner scan=new Scanner(System.in);
		System.out.println("enter month number ");
		int month = scan.nextInt();
      		String season;
      		switch (month){
        		case 12:
        		case 1:
        		case 2:
          		season="winter";
          		break;
        		case 3:
        		case 4:
        		case 5:
          		season="spring";
          		break;
        		case 6:
        		case 7:
        		case 8:
          		season="summer";
          		break;
        		case 9:
        		case 10:
        		case 11:
          		season="autumn";
          		break;
        		default:
          		season="bogus month";
      		}
      		System.out.println("month has " + season);
	}
}
