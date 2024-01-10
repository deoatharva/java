//to accept SGPI from student and display 1 to 10 grades
import java.util.Scanner;
class Sgpi {
    public static void main(String args[]) {
     
    Scanner scan = new Scanner(System.in);
	System.out.println("enter sgpi");
	double a = scan.nextDouble();
	if(a<=10){
		if(a==10){
		System.out.println("o grade");
		}
	else if(a>=9){
	System.out.println("a grade");
	}
	else if(a>=8){
	System.out.println("b grade");
	}
	else if(a>=7){
	System.out.println("c grade");
	}
	else if(a>=6){
	System.out.println("d grade");
	}
	else{
	 System.out.println("f grade");
	}
	}   
    else{
    System.out.println("enter properly");
    }
       
    }
}

