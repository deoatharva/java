// to check wethere a number is positive or negative
import java.util.Scanner;
class positivenegative {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
	System.out.println("enter b");
	int b = scan.nextInt();
        if(b==0){
	System.out.println("zero");
	}
	else if(b>0){
	System.out.println("positive number");
    }
    	else{
	System.out.println("negative number");
    
    }
    }
}
