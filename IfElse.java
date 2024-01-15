import java.util.Scanner;
class IfElse {
	public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter month");
		int month = scan.nextInt();
		String season;
		if(month==12||month==1||month==12)
			season="winter";
		else if(month==3||month==4||month==5)
			season="spring";
		else if(month==6||month==7||month==8)
			season="summer";
		else if(month==9||month==10||month==11)
			season="autumn";
		else
			season="bogus month"; 
		System.out.println("month has " + season );
    }
}
